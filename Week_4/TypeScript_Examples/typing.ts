//TypeScripts strong typing allows us to define types of our variables

let myString: string; //this is how you type a variable

let mySecondVar; //is defined as type any by default... DO NOT DO

mySecondVar = 10;

mySecondVar = '10';

myString = "Hello World";

//myString = 5;  will complain because of type

let anotherString = 'This is a string withoud :string';

//anotherString = [4, 5, 4];  TypeScript can infer types

let myNum:number = 10;  //unecessary, not used

//Other basic type

let aBoolean: boolean;

let anArray: Array<string>;

let anything: any;

let nothing: void;