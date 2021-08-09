import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  //DI for service class 
  //Router is a pre-defined class which help to do routing programmatically 
  // DI for Router 
  constructor(public loginSer:LoginService,public router:Router) { }
  msg?:string=""
  ngOnInit(): void {
  }
  checkUser(loginRef:NgForm){
    let login = loginRef.value;
    let flag = 0;
    this.loginSer.getLoginDetails().subscribe(
      data=> {
            data.forEach(ll=> {
              if(ll.user==login.user && ll.pass==login.pass){
                  flag++;
              }
            })
            if(flag>=1){
              this.router.navigate(["home"]);
            }else {
             this.msg = "Failure try once again!"
            }
      },
      error=>console.log(error)
    )
    loginRef.reset();   // reset form value. 
  }
}
