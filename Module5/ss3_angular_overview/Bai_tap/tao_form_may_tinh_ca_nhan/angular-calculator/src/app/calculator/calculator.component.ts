import {Component, OnInit} from '@angular/core';
import {parse} from '@angular/compiler/src/render3/view/style_parser';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  variable1 = 0;
  variable2 = 0;
  operator = '-';
  result = 0;

  operatorSum() {
    this.operator = '+';
  }

  operatorMinus() {
    this.operator = '-';
  }

  operatorMulti() {
    this.operator = '*';
  }

  operatorDivision() {
    this.operator = '/';
  }

  calculate() {
    switch (this.operator) {
      case '+':
        this.result = this.variable1 + this.variable2;
        break;
      case '-':
        this.result = this.variable1 - this.variable2;
        break;
      case '*':
        this.result = this.variable1 * this.variable2;
        break;
      case '/':
        this.result = this.variable1 / this.variable2;
        break;
    }

  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
