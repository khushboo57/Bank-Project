import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { AdminService } from '../Services/admin.service';
import{Router}from '@angular/router';
@Component({
  selector: 'app-admin-transfer-amount',
  templateUrl: './admin-transfer-amount.component.html',
  styleUrls: ['./admin-transfer-amount.component.css']
})
export class AdminTransferAmountComponent implements OnInit {

  constructor(private admin_service:AdminService,private router:Router) { }

  adminTransferForm:FormGroup;
  ngOnInit(){

  this.adminTransferForm=new FormGroup({
  debitAccNo:new FormControl,
  creditAccNo:new FormControl,
  addAmount:new FormControl,

});
}
usr_response;

submitForm() {
     
  
    console.log(this.adminTransferForm.value);
   this.admin_service.transferAmount(this.adminTransferForm.value).subscribe(resp=>this.usr_response=resp.json());


   
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.adminTransferForm.value));
    this.adminTransferForm.reset();
    this.router.navigate(['adminnext']);
} 

}
