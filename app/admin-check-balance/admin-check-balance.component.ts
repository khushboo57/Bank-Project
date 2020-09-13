import { Component, OnInit } from '@angular/core';
import {FormControl,FormGroup}from'@angular/forms';
import{Router}from '@angular/router';
import { AdminService } from '../Services/admin.service';
@Component({
  selector: 'app-admin-check-balance',
  templateUrl: './admin-check-balance.component.html',
  styleUrls: ['./admin-check-balance.component.css']
})
export class AdminCheckBalanceComponent implements OnInit {

  constructor(private admin_service:AdminService,private router:Router) { }
  balanceForm:FormGroup;
  ngOnInit(){

  this.balanceForm=new FormGroup({
  accountNo:new FormControl,

});
}

usr_response;
submitForm() {
     
  
    console.log(this.balanceForm.value);
   this.admin_service.checkBalance(this.balanceForm.get("accountNo").value).subscribe(resp=>this.usr_response=resp.json());


   
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.balanceForm.value));
    this.balanceForm.reset();
    this.router.navigate(['adminnext']);
} 
}
