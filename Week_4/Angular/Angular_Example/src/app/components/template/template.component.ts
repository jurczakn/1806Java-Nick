import { Component } from '@angular/core';

@Component({
  selector: 'app-template',
  templateUrl: './template.component.html',
  //template: '<h1>THis page is about templates</h1>', in-line templating
  styleUrls: ['./template.component.css']
})
export class TemplateComponent {
  title = 'Template';
  subTitleDeclaration = 'Declaration';
  image = 'assets/images/template.png';
  subTitleImageDeclaration = 'assets/images/templateDeclaration.png';
  documentation = 'https://angular.io/guide/architecture#templates';
}