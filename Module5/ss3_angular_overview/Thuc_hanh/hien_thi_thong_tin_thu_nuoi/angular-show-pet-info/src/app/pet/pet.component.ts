import { Component, OnInit } from '@angular/core';
import {Pet} from '../pet';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
  pet: Pet = {
    name: 'Meomeo',
    image: 'http://icdn.dantri.com.vn/zoom/1200_630/2021/09/08/meo-crop-1631079099680.jpeg'
  }

  constructor() { }

  ngOnInit(): void {
  }

}
