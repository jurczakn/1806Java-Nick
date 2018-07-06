//classes create blueprints
//in angular classes are used for component, services, directives, pipes, and many others


class Car{

    //fields
    engineName: string;
    gears: number;
    //^^^---- what access modifer? Public by Default
    //vvvvv-----access modifier
    private speed: number;

    accelerate(): void{

        this.speed++;

    }

    getSpeed(): number{

        return this.speed;

    }

    constructor(speed: number){

        this.speed = speed || 0;

    }

    static numberOfWheels(): number{

        return 4;

    }

}


let car = new Car(4);

car.accelerate();
console.log(car.getSpeed());
console.log(Car.numberOfWheels());