import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-structural',
  templateUrl: './structural.component.html',
  styleUrls: ['./structural.component.css']
})
export class StructuralComponent implements OnInit {

  title = 'Structural Directives';

  documentation = 'https://angular.io/guide/structural-directives';

  arrayOfThings = ['happy', 'sad', 'indifferent', 'another thing'];

  userInput: string;

  public addElement(): void {

    this.arrayOfThings.push(this.userInput);

  }

  constructor() { }

  ngOnInit() {
  }

}
