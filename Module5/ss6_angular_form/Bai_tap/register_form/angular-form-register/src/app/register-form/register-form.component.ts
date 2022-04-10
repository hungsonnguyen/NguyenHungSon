import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, NgForm, Validators} from "@angular/forms";

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {
  // @ts-ignore
  registerForm: FormGroup

  constructor() {
  }

  ngOnInit(): void {
    this.registerForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      passWord: new FormControl('',[Validators.required]),
      passWordConfig: new FormControl('',[Validators.required]),
      country: new FormControl('',[Validators.required]),
      age: new FormControl('',[Validators.required]),
      gender: new FormControl('',[Validators.required]),
      phone: new FormControl('',[Validators.required]),
    })
  }

  get email() {
    return this.registerForm.get('email');
  }
  get passWord() {
    return this.registerForm.get('passWord');
  }
  get passWordConfig() {
    return this.registerForm.get('passWordConfig');
  }
  get country() {
    return this.registerForm.get('country');
  }
  get age() {
    return this.registerForm.get('age');
  }
  get gender() {
    return this.registerForm.get('gender');
  }
  get phone() {
    return this.registerForm.get('phone');
  }

  onSubmit() {
    console.log(this.registerForm)
  }
}
