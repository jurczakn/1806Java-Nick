"use strict";
exports.__esModule = true;
var classes_1 = require("./classes");
var numArray;
numArray = [2, 3, 4, 5, 6, 7, 8, 9];
//numArray = ['hi', 'bye'];
function identity(arg) {
    return arg;
}
console.log(identity("Hi"));
var GenericClass = /** @class */ (function () {
    function GenericClass() {
    }
    return GenericClass;
}());
var car = new classes_1.Car(6);
