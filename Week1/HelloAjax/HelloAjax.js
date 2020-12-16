//Get the HTML elements
let pokepic = document.getElementById("pokepic");
let pokename = document.getElementById('pokename');
let poketype = document.getElementById('poketype');
let pokenum = document.getElementById('pokenum');

//set event listener for button click.
let button = document.getElementById('btn');
button.addEventListener("click", ajaxFunc);



function ajaxFunc(){
  let num = document.getElementById('field').value; 

  let xhr = new XMLHttpRequest(); 

  xhr.onreadystatechange = function () {
    if(this.readyState===4 && this.status===200){
      //this takes the JSON we get back and puts it into a JS object
      let data = JSON.parse(xhr.responseText)

      //Gets the values for the picture location from the object. Looked at PokeAPI documentation to find. 
      renderHTML(data); 
    }
  }

  xhr.open("GET", "https://pokeapi.co/api/v2/pokemon/"+num, true);
  xhr.send();
}

function renderHTML(data) {
  pokepic.setAttribute("src", data.sprites.front_default);
  pokename.innerText = data.name;
  pokenum.innerText = data.id; 
  poketype.innerText = data.types[0].type.name;
  if(data.types[1]){
    poketype.append(", "+data.types[1].type.name);
  }
}
