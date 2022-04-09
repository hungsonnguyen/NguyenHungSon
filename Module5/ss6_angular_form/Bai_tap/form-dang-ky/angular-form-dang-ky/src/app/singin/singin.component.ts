import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-singin',
  templateUrl: './singin.component.html',
  styleUrls: ['./singin.component.css']
})
export class SinginComponent implements OnInit {
singinForm: FormGroup;
  constructor() { }

  ngOnInit(): void {
    this.singinForm = new FormGroup({
      email : new FormControl('',[Validators.required,Validators.email]),
      password : new FormControl('',[Validators.required,Validators.minLength(3)])
    })
  }

  onSubmit() {
    console.log(this.singinForm.value);
  }

  get email(){
    return this.singinForm.get('email');
  }
  get password(){
    return this.singinForm.get('password');
  }
}
