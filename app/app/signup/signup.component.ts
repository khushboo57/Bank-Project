import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { SignupService } from '../Services/signup.service ';
import { Router } from '@angular/router';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private _signup:SignupService,private router:Router) { }
 

  signupForm:FormGroup;
  ngOnInit() {
    this.signupForm=new FormGroup({
      name: new FormControl ,
      mobile:new FormControl ,
      email: new FormControl,
      aadharNo:new FormControl,
      address:new FormControl ,
      password:new FormControl ,
    });
    
  }

  usr_response:any;
  

  submitForm() {
     
  
    console.log(this.signupForm.value);
   this._signup.addUser(this.signupForm.value).subscribe(resp=>this.usr_response=resp.json());


   
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.signupForm.value));
    this.signupForm.reset();
    this.router.navigate(['login']);
}

}
