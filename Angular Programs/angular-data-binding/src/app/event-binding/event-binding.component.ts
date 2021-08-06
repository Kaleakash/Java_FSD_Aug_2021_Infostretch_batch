import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  msg:string="Hi"
  constructor() { }

  ngOnInit(): void {
  }
  fun() {
    console.log("Event fired");
    this.msg = "Welcome to Angular "
    console.log(this.msg)
  }

  passName(nameRef:any){
    let name = nameRef.value;
    console.log("Your name is "+name);
  }
}
