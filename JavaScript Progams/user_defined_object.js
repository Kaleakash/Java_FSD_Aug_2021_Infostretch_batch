//ES5 style object creation using function style 
// function Employee() {
//         this.id = 100;
//         this.name = "Raj";      // instance property 
//         this.dis = function() {         // behaviour 
//             document.write("<br/>id is "+this.id);
//             document.write("<br/>name is "+this.name);
//         }
// }
// //Employee();     // normal function 
// var emp1 = new Employee();  // memory creation. 
// emp1.dis();
// //alert(emp1.id+" "+emp1.name)
// var emp2 = new Employee();
// emp1.dis();

// parameterized object creation. 
// function Employee(id,name) {
//     this.id = id;
//     this.name = name;      // instance property 
//     this.dis = function() {         // behaviour 
//         document.write("<br/>id is "+this.id);
//         document.write("<br/>name is "+this.name);
//     }
// }
// //Employee();     // normal function 
// var emp1 = new Employee(100,"Ravi");  // memory creation. 
// emp1.dis();
// //alert(emp1.id+" "+emp1.name)
// var emp2 = new Employee(101,"Ramesh");
// emp2.dis();

// ES5 style object creation using literal style 

// var emp1 = {id:100,name:"Ravi",age:21};
// var emp2 = {id:101,name:"Ramesh",age:24};
// document.write("<br>")
// document.write("id is "+emp1.id+" Name is "+emp1.name+" Age is "+emp1.age);

//ES6 class style 

// class Employee {
//     id=100;
//     name="Ravi";
//     age=21;
//     dis() {
//         document.write("<br/>Employee details are <br/>")
//         document.write("id is "+this.id)
//         document.write("name is "+this.name)
//         document.write("age is "+this.age)
//     }
// }
// let emp1 = new Employee();
// emp1.dis();
// let emp2 = new Employee();
// emp2.dis();


//ES6 parameterized constructor 

class Employee {
    // id=100;
    // name="Ravi";
    // age=21;
    constructor(id,name,age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    dis() {
        document.write("<br/>Employee details are <br/>")
        document.write("id is "+this.id)
        document.write("name is "+this.name)
        document.write("age is "+this.age)
    }
}
let emp1 = new Employee(100,"Ravi",21);
emp1.dis();
let emp2 = new Employee(101,"Ramesh",24);
emp2.dis();











