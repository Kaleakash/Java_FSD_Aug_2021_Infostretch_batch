import { Component } from '@angular/core';

@Component({
  selector: 'app-root',   // <app-root></app-root>
  templateUrl: './app.component.html',  // connected to html page 
  styleUrls: ['./app.component.css']    // connected to css page 
})
export class AppComponent {
  name:string ="Raj Deep";
  age:number = 21;
}
