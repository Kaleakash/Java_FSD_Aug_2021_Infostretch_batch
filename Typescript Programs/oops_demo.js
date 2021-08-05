/*class Employee {
    private id:number=100;
    private name:string = "Ravi";
    public dis(): void {
        console.log("Employee class function")
        console.log("id is "+this.id);
        console.log("name is "+this.name);
    }
}
let emp1 = new Employee();
emp1.dis();
*/
// emp1.id=-10;
// console.log(emp1.id)
// console.log(emp1.name)
// parameterized constructor 
// class Employee {
//     id;
//     name;
//     constructor(id:number,name:string){
//         this.id = id;
//         this.name = name;
//     }
//     dis():void {
//         console.log("id is "+this.id);
//         console.log("name is "+this.name);
//     }
// }
// let emp1 = new Employee(100,"Ravi");
// let emp2 = new Employee(101,"Ramesh");
// emp1.dis();
// emp2.dis();
// short cut construction initilization 
var Employee = /** @class */ (function () {
    function Employee(id, name) {
        if (name === void 0) { name = "Unkonwn"; }
        this.id = id;
        this.name = name;
    }
    Employee.prototype.dis = function () {
        console.log("id is " + this.id);
        console.log("name is " + this.name);
    };
    return Employee;
}());
var emp1 = new Employee(100, "Ravi");
var emp2 = new Employee(101, "Ramesh");
var emp3 = new Employee(102);
var emp4 = new Employee();
emp1.dis();
emp2.dis();
emp3.dis();
emp4.dis();
