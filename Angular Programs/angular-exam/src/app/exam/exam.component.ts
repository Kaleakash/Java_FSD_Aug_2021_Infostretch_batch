import { Component, OnInit } from '@angular/core';
import { ExamService } from '../exam.service';

@Component({
  selector: 'app-exam',
  templateUrl: './exam.component.html',
  styleUrls: ['./exam.component.css']
})
export class ExamComponent implements OnInit {
  questions:Array<any>=[];
  //DI for user-defined Service. 
  constructor(public ser:ExamService) { }
  // life cycle function after constructor get called..
  ngOnInit(): void {
    this.ser.loadQuestion().
    subscribe(data=>this.questions=data,
    error=>console.log(error),
    ()=>console.log("completed"))
  }

}
