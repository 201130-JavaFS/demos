//PokeAPI endpoint
const api='https://pokeapi.co/api/v2/pokemon/';

document.getElementById('getData').onclick = getData;

async function getData() {
  let userInput = document.getElementById('dataInput').value;

  document.getElementById('data').innerHTML='';

  let response = await fetch(api+userInput+'/'); 

  if(response.status === 200){
    let data = await response.json();
    populateData(data);
  } else {
    document.getElementById('data').innerHTML = "It got away!";
  }
}

function populateData(data) {
  let dataSection = document.getElementById('data');

  let nameTag = document.createElement('h3');
  nameTag.innerHTML = data.name;

  let abilitiesArray = data.abilities;
  let abil = document.createElement('ul');

  for(let oneAbility of abilitiesArray){
    let abLI =document.createElement('li');
    abLI.innerHTML=oneAbility.ability.name;
    abil.appendChild(abLI);
  }

  dataSection.appendChild(nameTag);
  dataSection.innerHTML += 'Abilities<br>'
  dataSection.appendChild(abil);
}