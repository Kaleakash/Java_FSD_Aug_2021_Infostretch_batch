// function hosting 
a=10;       // variable hosting can use for var variable 
b=20;       // variable hosting can't use for let variable. 
display();  // function hosting 

function display() {
    document.write("Normal function declaration");
}

//dis1();         // function hosting doesn't apply 
var dis1 = function() {
    document.write("Expression style function")
}
//dis1();



var a;
let b;