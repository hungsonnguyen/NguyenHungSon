import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {map, Observable} from "rxjs";
import {Todo} from "../model/todo";

@Injectable({
  providedIn: 'root'
})
export class TodoService {
private readonly API_URL = 'http://jsonplaceholder.typicode.com/todos';

  constructor(private http : HttpClient) { }
  getTodo(count:number = 10):Observable<Todo[]>{
    return this.http.get<Todo[]>(this.API_URL).pipe(
      map(data => data.filter((todo, i) => i<count))
    )
  }
  update(id:number,todo:Todo):Observable<Todo>{
    return this.http.put<Todo>(`${this.API_URL}/${id}`,todo)
  }
  delete(id:number):Observable<Todo>{
    return this.http.delete<Todo>(`${this.API_URL}/${id}`)
  }
  addTodo(todo:Partial<Todo>):Observable<Todo>{
    return this.http.post<Todo>(this.API_URL,todo)
  }
}
