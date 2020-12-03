const bubbling = false; 
const capturing = true; 



document.getElementById("inner").addEventListener("click", (event)=> {
  console.log("INNER - capturing")
//  event.stopImmediatePropagation(); //will stop even inner bubbling from triggering
//  event.stopImmediatePropagation(); //will not stop inner bubbling (same level) from triggering
}, capturing);

document.getElementById("middle").addEventListener("click", ()=> {
  console.log("MIDDLE - capturing")
}, capturing);

document.getElementById("outer").addEventListener("click", ()=> {
  console.log("OUTER - capturing")
}, capturing);

document.getElementById("inner").addEventListener("click", ()=> {
  console.log("INNER - bubbling")
}, bubbling);

document.getElementById("middle").addEventListener("click", ()=> {
  console.log("MIDDLE - bubbling");
}, bubbling);

document.getElementById("outer").addEventListener("click", ()=> {
  console.log("OUTER - bubbling")
}, false);