import { Component, OnInit } from '@angular/core';
import {DictionaryServiceService} from '../../service/dictionary-service.service';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {Dictionary} from '../../model/dictionary';

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {
word: string;
wordmean: Dictionary;
  constructor(private dictionaryServiceService:DictionaryServiceService,
              private activatedRoute: ActivatedRoute,
  ) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap:ParamMap)=>{
      this.word = paramMap.get('word')
      this.wordmean = this.dictionaryServiceService.search(this.word);
    })
  }

}
