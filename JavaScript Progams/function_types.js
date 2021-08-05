// Normal function syntax 
function display1() {
    document.write("<br> This is normal function")
}
display1();

// expression style function with name 
// variable name is a function name
var dis2 = function display2() {
    document.write("<br> This is expression style function")
}
//display2();
dis2();
// expression style function with anonymous function 
var dis3 = function() {
    document.write("<br> Exprssion style function without name")
}
dis3();

// arrow function 
var dis4 = ()=>document.write("<br/>Arrow function");
dis4();

//passing parameter with expression style 
var addNumber1=function(a,b){
    var sum = a+b;
    return sum;
}
document.write("<br/>Sum of two number using expression style "+addNumber1(10,20))

// passing parameter with arrow style,
// arrow function by default return without return keyword  
var addNumber2 = (a,b)=>a+b;
document.write("<br/> Sum of two number usng arrow is "+addNumber2(1,2));

var findLargest = (a,b)=> {
        if(a>b){
            return "a is largest"
        }else {
            return "b is largest"
        }
}
document.write("<br> Find largest number is "+findLargest(10,20));


// callback fuction 
function greeting(fname,callback){
    return "Welcome "+callback(fname);
}
function maleInfo(fname){
    return "Mr "+fname;
}
let femaleInfo = function(fname){
    return "Miss "+fname;
}
document.write("<br>")
document.write(greeting("Raj",maleInfo));
document.write("<br>")
document.write(greeting("Seeta",femaleInfo));
document.write("<br>")
document.write(greeting("Ajay",function(fname){
    return "Mr "+fname;
}))
document.write("<br>")
document.write(greeting("Reeta",(fname)=>"Miss "+fname));




