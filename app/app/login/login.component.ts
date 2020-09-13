import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormGroup } from '@angular/forms';
import{FormControl} from '@angular/forms';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  profileForm:FormGroup;
  constructor(private router:Router,private activated:ActivatedRoute) { }

  ngOnInit() {

    this.profileForm=new FormGroup({
      
      mobile:new FormControl ,
      password:new FormControl 
    });



  }

signup()
{
this.router.navigate(['/signup']);

}


}
