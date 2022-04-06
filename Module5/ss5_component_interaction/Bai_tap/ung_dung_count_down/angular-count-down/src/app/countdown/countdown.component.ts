import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-countdown',
  templateUrl: './countdown.component.html',
  styleUrls: ['./countdown.component.css']
})
export class CountdownComponent implements OnInit {
  count: number = 60;
  id: any;

  constructor() {
  }

  setIntvalFunc() {
    if (this.count >= 0) {
      this.id = setInterval(() => this.countdown(), 1000);
    }
  }

  stopIntval() {
    clearInterval(this.id)
  }

  ngOnInit(): void {

  }

  countdown() {
    this.count--;
    if (this.count <= 0) {
      this.stopIntval();
    }

    console.log(this.count)
  }

  reset() {
    this.count = 60;
  }

  changeTime(num: string) {
    this.count = parseFloat(num);
  }
}
