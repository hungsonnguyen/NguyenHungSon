import {Component, OnInit} from '@angular/core';
import {IRatingunit} from "../iratingunit";

@Component({
  selector: 'app-angular-component-template',
  templateUrl: './angular-component-template.component.html',
  styleUrls: ['./angular-component-template.component.css']
})
export class AngularComponentTemplateComponent implements OnInit {
  rate: IRatingunit = {
    value: 0,
    active: false
  }
  units: IRatingunit[] = [
    {value: 1, active: false},
    {value: 2, active: false},
    {value: 3, active: false},
    {value: 4, active: false},
    {value: 5, active: false},
    {value: 6, active: false},
    {value: 7, active: false},
    {value: 8, active: false},
    {value: 9, active: false},
    {value: 10, active: false},
  ]

  constructor() {
  }

  ngOnInit(): void {
  }

  ratingValue(value: number) {
    this.rate.value = value;
    let count = 0;
    let minus = 0
    for (let i = 0; i < value; i++) {
      this.units[i].active = true;
      count++;
    }
    console.log("count"+count)
    for (let j = count; j < this.units.length; j++) {
      this.units[j].active = false;
      minus++;
    }
    console.log("minus"+minus)
    console.log("count"+count)

    value = 0;
    for (let j = 0; j < this.units.length; j++) {
      console.log(this.units[j])
    }
    console.log(value)
  }
}
