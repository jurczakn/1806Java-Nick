//classes create blueprints
//in angular classes are used for component, services, directives, pipes, and many others
var Car = /** @class */ (function () {
    function Car(speed) {
        this.speed = speed || 0;
    }
    Car.prototype.accelerate = function () {
        this.speed++;
    };
    Car.prototype.getSpeed = function () {
        return this.speed;
    };
    Car.numberOfWheels = function () {
        return 4;
    };
    return Car;
}());
var car = new Car(4);
car.accelerate();
console.log(car.getSpeed());
console.log(Car.numberOfWheels());
