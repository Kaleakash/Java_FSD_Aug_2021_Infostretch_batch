import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Login } from './login.model';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  //DI for HttpClient
  constructor(public http:HttpClient) { }

  // we are converted all json data to login array object. 
  getLoginDetails():Observable<Login[]> {
    return this.http.get<Login[]>("http://localhost:3000/login")
  }
  //post is use to store the records 
  //it takes 2 parameter 1st parameter url 
  // 2nd parameter is data in json format. 
  createLoginAccount(login:Login){
    this.http.post("http://localhost:3000/login",login).
    subscribe(result=>console.log(result),error=>console.log(error));
  }
}
