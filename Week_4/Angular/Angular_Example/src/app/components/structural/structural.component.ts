import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural',
  templateUrl: './structural.component.html',
  styleUrls: ['./structural.component.css']
})
export class StructuralComponent implements OnInit {

  title = 'Structural Directives';

  documentation = 'https://angular.io/guide/structural-directives';

  arrayOfThings = ['happy', 'sad', 'indifferent'];

  constructor() { }

  ngOnInit() {
  }

}
