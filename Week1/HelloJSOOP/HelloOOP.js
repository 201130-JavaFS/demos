//Object without a specific class. 
let obj = {
  name:"tim",
  age:30,
  favoriteAnimal: "unicorns"
}

console.log(obj); 

//Class declarations

class Person {
  constructor(name, age){
    this.name = name;
    this.age = age;
  }
}

let Tim = new Person("Tim", 30); 

console.log(Tim);

let Pet = class {
  constructor(name, type){
    this.name=name;
    this.type=type;
  }
}

let artemis = new Pet("Artemis", "Cat");

console.log(artemis); 

//Object Prototypical inheritance

let animal={
  eats:true,
  walk() {
    alert("I can walk!");
  }
};

let rabbit = {
  jump:true,
  __proto__:animal
}; 

alert(rabbit.eats);
alert(rabbit.jump);

rabbit.walk();

console.log(rabbit); 

//adding/changing keys/values in objects. 

rabbit.color="white"; 

console.log(rabbit); 


rabbit.jump=false;


console.log(rabbit); 
