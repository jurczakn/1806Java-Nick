//Interfaces are contracts for other classes and objects
//Can be used to define custom types without creating classes
//Interfaces ARE NOT compiled to JavaScript? Used for validation done by type-checker
interface User{

    username: string;
    password: string;
    confirmPassword?: string; //optional field

}

let user:User;

user = {username: 'bob', password: 'bobbert'}; //valid instantiation of user
user = {username: 'bobby', password: 'bobieta', confirmPassword: 'bobieta'}; // also valid
//user = {masterUsername: 'newUser', masterPassword: 'jokes on you'};

interface CanDrive{

    accelerate(speed: number): void;

}

let car: CanDrive = {

    accelerate: function (speed: number) {

        //...
    }

}