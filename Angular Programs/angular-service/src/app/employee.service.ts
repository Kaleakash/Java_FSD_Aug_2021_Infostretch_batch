import { Injectable } from "@angular/core";
import {HttpClient} from '@angular/common/http';
import { Observable } from "rxjs";
import { Employee } from "./employee";

@Injectable()               // This class eligible to achieve DI
export class EmployeeService {

    // DI for HttpClient done 
    constructor(public http:HttpClient){

    }
        display():string {
            return "Welcome to Service with DI";
        }
        // all HttpClient method return type of Observable
        // to load the data from Observable we have to use 
        //subscribe. 
    // loadJsonData() {
    // return this.http.get("./assets/employee.json")
    // }

    loadJsonData():Observable<Employee[]> {
        return this.http.get<Employee[]>("./assets/employee.json");
    }

}