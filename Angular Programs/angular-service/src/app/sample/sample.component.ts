import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { MyService } from './custom.service';


@Component({
  selector: 'app-sample',
  templateUrl: './sample.component.html',
  styleUrls: ['./sample.component.css']
})
export class SampleComponent implements OnInit {
  msg1:string=""
  msg2:string="";
  // constructor base DI
  constructor(public mySer2:EmployeeService) { }    //pulling the object from container 

  ngOnInit(): void {
  }

  fun1() {
    let mySer1 = new MyService();
    this.msg1=mySer1.display1();
  }
  fun2() {
    this.msg2 = this.mySer2.display();
  }
}
