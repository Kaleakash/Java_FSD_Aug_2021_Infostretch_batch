let num1 = [10,20,30,40,50,60];
document.write("display element using callback<br/>");

num1.forEach(display);     // forEach take callback function as a parameter 

function display(n){
    document.write("<br/> Value is "+n)
}

num1.forEach(function(n){
    document.write("<br> Value is "+n)
})

num1.forEach(n=>document.write("<br> VAlue is "+n));