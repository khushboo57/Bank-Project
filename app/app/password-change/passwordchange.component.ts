import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { UserService } from '../Services/user.service';
import { RouterLinkActive, Router } from '@angular/router';

@Component({
  selector: 'app-passwordchange',
  templateUrl: './passwordchange.component.html',
  styleUrls: ['./passwordchange.component.css']
})
export class PasswordchangeComponent implements OnInit {

  constructor(private _userService:UserService,private router:Router) { }
  passChangeForm:FormGroup;
  ngOnInit(){

  this.passChangeForm=new FormGroup({
  accountNo:new FormControl,
  oldpassword:new FormControl,
  newpassword:new FormControl,

});
}
usr_response:string;
submitForm(){

  console.log(this.passChangeForm.value);
  this._userService.changePassword(this.passChangeForm.value).subscribe(resp=>this.usr_response=resp.text());
  document.getElementById('btn-modal').click();
  console.log(this.usr_response);
}

}
