import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {

  interpolation = 'Welcome to the Interpolation';

  interpolationNotation = '{{}}';

  title = 'Interpolation';

  propertyBindingNotation = '[]';

  twoWayBindingNotation = '[{}]';

  public objectStyle = {

    color: 'red',
    border: '1px solid black',
    cursor: 'pointer',
    margin: '2px'

  }

  eventBindingNotation = '()';

  counter = 0;

  public addToCounter(){

    this.counter++;

  }

  public changeStyles(): void {

    if (this.objectStyle.color === 'red') {       //'this' is manditory

      this.objectStyle.color = 'green';
      this.objectStyle.border = '3px groove purple';

    } else if (this.objectStyle.color === 'green'){
            this.objectStyle.color = 'blue';
            this.objectStyle.border = '3px ridge yellow';
    } else if(this.objectStyle.color === 'blue'){
            this.objectStyle.color = 'red';
            this.objectStyle.border = '3px solid black';
          }

  }

  constructor() { }

  ngOnInit() {
  }



}
