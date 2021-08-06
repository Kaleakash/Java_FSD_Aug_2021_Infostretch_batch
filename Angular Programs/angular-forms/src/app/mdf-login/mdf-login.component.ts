import { Component, OnInit } from '@angular/core';
import { FormArray, FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-mdf-login',
  templateUrl: './mdf-login.component.html',
  styleUrls: ['./mdf-login.component.css']
})
export class MdfLoginComponent implements OnInit {
  profile = new FormGroup({
    fname:new FormControl(),
    lname:new FormControl(),
    gender:new FormArray([
      ]),
    education:new FormControl(),
    city:new FormControl(),
    state:new FormControl()
  });

  constructor() { }

  ngOnInit(): void {
  }
  register(){
    let pr = this.profile.value;
    console.log(pr)
  }
}
