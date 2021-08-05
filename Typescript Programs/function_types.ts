// function with number of parameter must be match
function abc(a,b){
    console.log(a+" "+b)
}
abc(10,20);
abc("A","B");
abc("Raj","Deep");
// number of parameter with data types must be match 
function addNumber(a:number,b:number){
    console.log(a+" "+b)
}
addNumber(10,20);
addNumber(10.10,20.20);
//addNumber("Raj","Deep");

// function no return type 
function info(): void {
    console.log("info ")
    //return "Welcome";
}
function sayHello() :string {
    return "Welcome";
}
function add(a:number,b:number):number {
    return a+b;
}
function sayHi():any {
    //return true;
    //return "Welcome"
}
//IIFE 
(function(){
    console.log("function called.")
})()

// function with optional parameter ? optional 
// right to left 
function empInfo(id?:number,name?:string,age?:number){

}
empInfo(1,"Ravi",21);
empInfo(2,"Raju");
empInfo(3);
empInfo();

// function with default intialization 
function studentInfo(id:number=0,name:string="Unkonwn",age:number=6): void {

}
studentInfo(1,"Ajay",21)
studentInfo(2,"Raju");
studentInfo(3)
studentInfo();



