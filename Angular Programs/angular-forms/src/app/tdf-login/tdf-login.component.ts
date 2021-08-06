import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-tdf-login',
  templateUrl: './tdf-login.component.html',
  styleUrls: ['./tdf-login.component.css']
})
export class TdfLoginComponent implements OnInit {
  msg:string=""
  constructor() { }

  ngOnInit(): void {
  }

  checkUser(loginRef:NgForm){
    //console.log("fired")
     let login = loginRef.value
     //console.log(login);
     if(login.user =="Raj" && login.pass=="123"){
        this.msg = "Successfully Login"
     }else {
        this.msg = "Failure try once again"
     }
  }
}
