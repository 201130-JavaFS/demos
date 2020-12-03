//Get the HTML img element
let pokepic = document.getElementById("pokepic");

function ajaxFunc(){
  let num = 151; 

  let xhr = new XMLHttpRequest(); 

  xhr.onreadystatechange = function () {
    if(this.readyState===4 && this.status===200){
      //this takes the JSON we get back and puts it into a JS object
      let data = JSON.parse(xhr.responseText)

      //Gets the values for the picture location from the object. Looked at PokeAPI documentation to find. 
      pokepic.setAttribute("src", data.sprites.front_default);
    }
  }

  xhr.open("GET", "https://pokeapi.co/api/v2/pokemon/"+num, true);
  xhr.send();
}

ajaxFunc();
