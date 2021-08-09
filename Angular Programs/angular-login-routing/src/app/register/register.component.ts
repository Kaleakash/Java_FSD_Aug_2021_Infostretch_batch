import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  //DI for LoginService 
  constructor(public loginSer:LoginService) { }

  ngOnInit(): void {
  }

  accountCreate(loginRef:NgForm){
    let login = loginRef.value;
    //console.log(login);
    this.loginSer.createLoginAccount(login);
  }
}
