import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { UserService } from '../Services/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-transfer-money',
  templateUrl: './transfer-money.component.html',
  styleUrls: ['./transfer-money.component.css']
})
export class TransferMoneyComponent implements OnInit {

  constructor(private user_service:UserService,private router:Router) { }
 transferForm:FormGroup;
  ngOnInit() {
           this.transferForm=new FormGroup({
            debitAccNo: new FormControl ,
            creditAccNo:new FormControl ,
            addAmount:new FormControl
    });  
  }


  usr_response:any;
  

  submitForm() {
     
  
    console.log(this.transferForm.value);
   this.user_service.transferAmount(this.transferForm.value).subscribe(resp=>this.usr_response=resp.json());


   
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.transferForm.value));
    this.transferForm.reset();
    this.router.navigate(['login/userinfo']);
}



}
