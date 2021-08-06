import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-retrieve',
  templateUrl: './employee-retrieve.component.html',
  styleUrls: ['./employee-retrieve.component.css']
})
export class EmployeeRetrieveComponent implements OnInit {
  employeeDetails:Array<Employee>=[];
  // DI for Service
  constructor(public empSer:EmployeeService) { }

  ngOnInit(): void {
  }
  loadData() {
    // this.empSer.loadJsonData().subscribe(
    //   //data=>console.log(data)
    //   error=>console.log(error),
    //   ()=>console.log("done"));

   this.empSer.loadJsonData().
   subscribe(data=>this.employeeDetails=data);
  }
}
//This class is use to map the json data from file

