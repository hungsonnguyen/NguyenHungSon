import {Component, OnInit} from '@angular/core';
import {FormControl} from "@angular/forms";
import {TodoService} from "../service/todo.service";
import {Todo} from "../model/todo";

let _id = 1;

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  todos: Todo[] = [];
  todoForm = new FormControl();


  constructor(private todoService: TodoService) {
  }

  ngOnInit(): void {
    this.todoService.getTodo().subscribe(next => {
      this.todos = next;
    }, error => {
      console.log(error);
    }, () => {
      console.log('complete')

    })
    console.log(this.todos)
  }

  toggleTodo(i: number) {
    const todo = this.todos[i]
    todo.completed = !todo.completed;
    this.todoService.update(todo.id, todo).subscribe(next => {
      this.todos[i].completed = next.completed;
      console.log(todo)
    })
  }



  deleteTodo(id: number) {
    const todo = this.todos[id];
    this.todoService.delete(id).subscribe(()=>{
      this.todos = this.todos.filter(
        t => t.id !== todo.id
      )
    })
  }
  addTodo(){
    const todo: Partial<Todo> = {
      title: this.todoForm.value,
      completed: false
    };
    this.todoService.addTodo(todo).subscribe(next =>{
      this.todos.unshift(next);
      this.todoForm.setValue('');
    })
  }
}
