/* 
**JavaScript Week 
*/

alert("no no no no no!!!!!!!!!!!!");

console.log(a);

var a = 10;

var b, d, e, f, g, h, i;

b = "10";
c = true
d = {};
e = null;
//f
g = (0/0)
h = [];
function i (){};
i = function(){console.log("this")};
var h = 12;

console.log('value of a is:' + a);

var myString = "new string"

function addToString(s){

    s += " my new value added";
    console.log(s);

}

function Book(title, year, author, text){

    var obj = {}
    obj.title = title;
    obj.year = year
    obj.author = author;
    obj.read = function(){console.log(text)}
    return obj;

}

var book = {

    title: "The Fellowship of the Ring",
    year: 1954,
    author: {
        name: "JRR Tolkein",
        dob: 1892
    },

    read: function(){ console.log("And Frodo destroyed the ring of power")}

}

function incrementA(x){

    x+=1 
    /* semi-colon injection
            v---------------- JS is placing a semi-colon here
    */
    return 
    x

    var y =  x + 5; 

}

try {

    throw new Error("This is an error");

}

catch(e){

    console.log(e.message);

}

//throw new Error("will this break");

//null.f;

console.log("Maybe");

var sumNum = function (x, y, z){

    console.log("inside 3 param function");
    return x + y + z;

} 

sumNum = function (x, y){

    console.log("x:" + x);
    console.log("y:" + y);
    console.log("inside 2 param function");
    let returnValue = 0;
    for (i in arguments){

        returnValue += arguments[i];

    }
    return returnValue;

}

var Book = function(){};
Book.prototype.read = function(){ console.log("I am reading a book");};

var myBook = new Book();

var TextBook = function(){};
TextBook.prototype = new Book();

myTextBook = new TextBook();

Book.prototype.burn = function(){ console.log("I am either really cold or really hate the spread of information");};

TextBook.prototype.read = function(){ console.log("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");};

Book = null;

/* */