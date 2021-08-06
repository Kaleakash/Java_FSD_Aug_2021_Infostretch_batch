import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EmployeeService } from './employee.service';
import { SampleComponent } from './sample/sample.component';
import { EmployeeRetrieveComponent } from './employee-retrieve/employee-retrieve.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    SampleComponent,
    EmployeeRetrieveComponent
  ],
  imports: [
    BrowserModule,HttpClientModule
  ],
  providers: [EmployeeService],   // provided details about service. 
  bootstrap: [AppComponent]
})
export class AppModule { }
