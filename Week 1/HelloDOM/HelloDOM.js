//I want all my divs with the classname coolclassname.

let divElements = document.getElementsByClassName("coolclassname"); 

//now I want my first div element

let firstDiv = divElements[0]; 

//this works but is consider bad practice. There is an actual style object you can 
//set properties of for every element. 
firstDiv.setAttribute("style", "background-color:pink;");

let myButton = document.getElementsByTagName('button')[0];

myButton.onclick = domFunc;

function domFunc() {
  // let emptyP = document.getElementById('p3');
  // emptyP.textContent = "I have content!"; 
  document.getElementById('p3').textContent = "I have content"; 
}

