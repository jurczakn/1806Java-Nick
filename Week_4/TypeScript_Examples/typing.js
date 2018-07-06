//TypeScripts strong typing allows us to define types of our variables
var myString; //this is how you type a variable
var mySecondVar; //is defined as type any by default... DO NOT DO
mySecondVar = 10;
mySecondVar = '10';
myString = "Hello World";
//myString = 5;  will complain because of type
var anotherString = 'This is a string withoud :string';
//anotherString = [4, 5, 4];  TypeScript can infer types
var myNum = 10; //unecessary, not used
//Other basic type
var aBoolean;
var anArray;
var anything;
var nothing;
