import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-string-interpolation',
  templateUrl: './string-interpolation.component.html',
  styleUrls: ['./string-interpolation.component.css']
})
export class StringInterpolationComponent implements OnInit {
  fname:string="Raj Deep";
  constructor() { }

  ngOnInit(): void {    // initialization 
  }

  dis():string {
    return "Welcome to Angular application";
  }
}
