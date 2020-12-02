//This will print to the console, not the actual webpage. 
console.log("Hello JavaScript, it is nice to meet you!");

//JavaScript is loosely typed so I can change the type of value a variable holds. 

var a = 100; 
console.log(a);
a = true;
a = null;
a = "I'm a string";
console.log(a); 

var b;
console.log(b); //prints undefined. 

//JS will add the var here as it is the first time the variable appears. 
c = "woot, where's my declaration?";

console.log(c);

console.log("=================================================")

function test(var1, var2){
  console.log(var1+" compared to "+var2);
  console.log(var1 == var2); 
}

test("3", 3);
test(0,false);
test(1,true);
test(2,true); 
test(2,false);

//while 2 is truthy, the boolean true is 
//evaluated as the number 1 and false is evaluated as 0 so when 
//compared the result is always false

if(2){
  console.log("2 is true")
}else{
  console.log("2 is false")
}

if(0){
  console.log("0 is true")
}else{
  console.log("0 is false")
}


test(null, undefined);
test('', false);
test('string', true);
test('true', true); // ends up comparing "true"=="1"; 
test("1", true);
test("false", false);
test("0", false);

test(NaN, null);
test(NaN, undefined);
test(NaN, false);

console.log("=================================================")


function test2(var1){
  if(var1){
    console.log(var1+" is truthy");
  }else{
    console.log(var1+" is falsy");
  }
}


test2(0)
test2(false)
test2(null)
test2(b)
test2(NaN)
test2("")

test2(2)
test2(-37)
test2("'false'")
test2("0") 
/*Any string, even a string that in comparison (using ==) would equal false 
will be evaluated as true in a boolean statement */
