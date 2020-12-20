const url = 'http://localhost:8080/AvengersDemo/';

document.getElementById("getAvButton").addEventListener('click', assembleFunc);

document.getElementById("loginbtn").addEventListener('click', loginFunc);

async function loginFunc() {
  let usern = document.getElementById("username").value;
  let userp = document.getElementById("password").value;

  let user = {
    username:usern,
    password:userp
  };

  let resp = await fetch(url+'login', {
    method:"POST",
    body: JSON.stringify(user),
    credentials: 'include'
    //Credentials:include will ensure that they cookie is captured, future fetch requests
    //will also require this value in order to send the cookie back. 
  });

  if(resp.status===200){
    document.getElementById('login-row').innerText="YOU HAVE LOGGED IN";
    //add button to submit a new advenger
    let button2 = document.createElement('button');
    button2.className = "btn btn-success";
    button2.id = "addAvBtn";
    button2.innerText = "Add a Avenger";
    button2.onclick = AddFunc;
    document.getElementById("formbtn").appendChild(button2);  
  }else{
    document.getElementById('login-row').innerText="Login failed! Reload the page of the computer will explode!"; 
  }

}


async function assembleFunc(){
  let response = await fetch(url+"avengers", {credentials: 'include'});

  if(response.status===200){
    console.log(response);
    let data = await response.json();

    for(let avenger of data){
      console.log(avenger);
      let row = document.createElement("tr");

      let cell = document.createElement("td");
      cell.innerHTML = avenger.aveId;
      row.appendChild(cell);

      let cell2 = document.createElement("td");
      cell2.innerHTML = avenger.aveName;
      row.appendChild(cell2);

      let cell3 = document.createElement("td");
      cell3.innerHTML = avenger.power;
      row.appendChild(cell3);

      let cell4 = document.createElement("td");
      cell4.innerHTML = avenger.firstName;
      row.appendChild(cell4);

      let cell5 = document.createElement("td");
      cell5.innerHTML = avenger.lastName;
      row.appendChild(cell5);

      let cell6 = document.createElement("td");
      cell6.innerHTML = avenger.powerLevel;
      row.appendChild(cell6);

      if(avenger.home != null){
        let cell7 = document.createElement("td");
        cell7.innerHTML = avenger.home.homeName;
        row.appendChild(cell7);
      }else {
        let cell7 = document.createElement("td");
        row.appendChild(cell7);
      }

      document.getElementById("avbody").appendChild(row);

    }
  }
}

async function AddFunc(){

  let sName = document.getElementById("supName").value;
  let sPower = document.getElementById("supPower").value;
  let fName = document.getElementById("fName").value;
  let lName = document.getElementById("lName").value;
  let pLevel = document.getElementById("pLevel").value;
  let home = document.getElementById("home").value;

  let avenger = {
      supName : sName,
      supPower : sPower,
      firstName : fName,
      lastName : lName,
      powerLevel : pLevel,
      homeString : home 
  }

  console.log(avenger)

  let resp = await fetch(url + "avengers", {
      method: 'POST',
      body: JSON.stringify(avenger),
      credentials: "include"
  })

  if(resp.status === 201){
      assembleFunc()
  } else {
      document.getElementById("login-row").innerText = "Avenger could not be added.";
  }

}