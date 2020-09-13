import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { UserService } from '../Services/user.service';

@Component({
  selector: 'app-requestmobchange',
  templateUrl: './requestmobchange.component.html',
  styleUrls: ['./requestmobchange.component.css']
})
export class RequestmobchangeComponent implements OnInit {

  constructor(private _userService:UserService) { }
reqMobForm:FormGroup
  ngOnInit() {

    this.reqMobForm=new FormGroup({
      accountNo:new FormControl,
      oldMobNo:new FormControl,
      newMobNo:new FormControl,
    
    });

  }

  usr_response:any;
  submitForm(){

    console.log(this.reqMobForm.value);
    this._userService.reqMobileChange(this.reqMobForm.value).subscribe(resp=>this.usr_response=resp.text());
   
  }




}
