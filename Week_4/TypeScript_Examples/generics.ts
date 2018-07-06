import {Car} from './classes';

let numArray: Array<number>;

numArray = [2, 3, 4, 5, 6, 7, 8, 9];
//numArray = ['hi', 'bye'];

function identity<T>(arg: T): T {

    return arg;

}

console.log(identity("Hi"));

interface GenericInterface<T> {

    stuff: T;

    (arg: T) : T;

}

class GenericClass<T extends Car> {

    stuff: T;
    stuff2: T;

    add: (x: T, y: T) => T;

}

let car = new Car(6);