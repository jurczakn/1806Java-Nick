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