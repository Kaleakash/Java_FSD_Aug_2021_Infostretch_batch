import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'  // is equal to provided attribute in module.ts file 
})
export class ExamService {

  //DI for HttpClient 
  constructor(public http:HttpClient) { }

  loadQuestion():Observable<any[]>{
    return this.http.get<any[]>("http://localhost:3000/questions")
  }
}
