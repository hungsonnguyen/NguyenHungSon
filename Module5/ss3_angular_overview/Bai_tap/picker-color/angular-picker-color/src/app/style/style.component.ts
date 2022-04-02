import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-style',
  templateUrl: './style.component.html',
  styleUrls: ['./style.component.css']
})
export class StyleComponent implements OnInit {
  word: string;
  color: string;

  constructor() {
  }

  ngOnInit(): void {
  }

  changeFormatColor(value: string) {
    this.color = value;
  }

  changeRedColor(value: string) {
    this.color = 'red';
  }

  changeBlueColor(value: string) {
    this.color = 'blue';
  }

  changeYellowtColor(value: string) {
    this.color = 'yellow';
  }

  changeGreentColor(value: string) {
    this.color = 'green';
  }
}
