var obj1 = [10,20,30,40,50];
var obj2 = new Array(10,20,30,40,50);
document.write(obj1);
document.write("<br/>")
document.write(obj2);
document.write("<br/>")
document.write(obj1.join("-"));
document.write("<br/>")
document.write("Size "+obj1.length);
document.write("<br/>")
document.write("Size "+obj2.length);
obj1.push(100);     //add the element at last 
obj1.push(200)
obj1.unshift(300)       // add the element at begining 
obj1.unshift(400);
document.write("<br/>All element after added "+obj1)
obj1.pop();         // remove from last 
obj1.shift();       // remove from the begining 
document.write("<br/>All element after removed "+obj1)
//splice, we add, remove and replace the elements from 
//1st parameter is index position
//2nd parameter deleteCount 
//3rd parameter add or replace elements  
//obj1.splice(2,1);       // 2nd index position deleted
//obj1.splice(2,3);       // from 2nd index position 3 element delete 
//obj1.splice(2,1,1000);      // 2nd position element delete and add 1000
//obj1.splice(2,0,2000);         // 
//document.write("<br/> elements are "+obj1);
var result1 = obj1.findIndex(v=>v==2);  // if element present return index else return -1 
document.write("<br> index position "+result1)
obj1.splice(result1,1,25)
document.write("<br/> array element are "+obj1);

obj1.forEach(v=>document.write("<br/> VAlue is "+v))