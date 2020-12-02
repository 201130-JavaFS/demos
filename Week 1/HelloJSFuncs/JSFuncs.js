//This is a basic JS function. 
//Note because of hoisting we can call the function before we declare it.


helloWorld(); 

function helloWorld() {
  console.log("HELLO WORLD!");
}

var anon = function () {
  console.log("I'm an anonymous function");
}

anon(); 

var arrow = () => {console.log("I am an arrow function!")}

arrow();

//Callback function

function func1(x){
  console.log("x = "+x);
}


function func2 (y, cb){
  cb(y); 
}

func2(9, func1); 

func2(7, (x)=>{console.log("You gave me "+x)}); 

//func1 and the arrow function are the callback functions func2 is invoking. 

console.log("================================================================");

//Scopes

console.log(a);//undefined because it was hoisted. 

//this is on the global scope
var a = 5;

console.log(a);//5

// console.log(b); throws a reference error because let is not hoisted. 

let b = "b";

console.log(b);

console.log("================================================================");

console.log(c);

if(true){
  var c = "I'm in a block";
  console.log(c);
}

console.log(c);


if(true){
  let d = "I'm a let in a block"; 
  console.log(d);
}

//console.log(d); This causes a reference error because d is out of scope. 

function testScope() {
  //var e is hoisted only to the top of the function, not to the global scope. 
  console.log(e); //undefined 
  var e = "I'm in a function";
  console.log(e);
}


testScope();
//console.log(e); e is out of scope so this causes a reference error. 
