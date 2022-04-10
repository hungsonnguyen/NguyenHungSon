import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm: FormGroup;

  constructor() {
  }

  ngOnInit(): void {
    function comparePassword(passWord: AbstractControl) {
      const checkPass = passWord.value;
      // console.log(checkPass.passWord)
      // console.log(checkPass.passWordConfig)
      if (checkPass.passWord === checkPass.passWordConfig){
        return null;
      }
      console.log('passwordnotmatch')
      return {'passwordnotmatch': true};
    }

    function checkAge(dateOfBirth : AbstractControl){
      console.log(dateOfBirth.value);
      const birth = new Date(dateOfBirth.value);
      const birthday = Date.now() - birth.getTime() -86400000;
      const time = new Date(birthday);
      console.log(time.getUTCFullYear());
      const age = time.getUTCFullYear()- 1970;
      console.log('age:'+age);
      if (age<18){
        return {"ageUnder" : true}
      }
      return null;

    }
    this.registerForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      passWordGroup: new FormGroup({
        passWord: new FormControl('', Validators.required),
        passWordConfig: new FormControl('', [Validators.required]),
      },comparePassword),

      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required, checkAge]),
      gender: new FormControl(),
        phone: new FormControl('', [Validators.required,Validators.pattern( /^\+84\d{9,10}$/)]),
    });
  }
  get passWordGroup(){
    return this.registerForm.get('passWordGroup')
  }

  get email() {
    return this.registerForm.get('email');
  }

  get passWord() {
    return this.passWordGroup.get('passWord');
  }

  get passWordConfig() {
    return this.passWordGroup.get('passWordConfig');
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
    console.log(this.registerForm.value);
  }


}
