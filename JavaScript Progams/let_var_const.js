var a=10;   
a=20;       // re-initialization     
var a = 40; // re-declaration       int a=10;   int a=20;

let b = 10;
b = 20;     // re-initialization 
//let b = 40;     // Error 

for(var i=0;i<10000;i++){

}
document.write("<br> Value of i is "+i);
for(let j=0;j<10000;j++){

}
//document.write("<br/> Value of j "+j);

const k = 1000;
//k = 2000;