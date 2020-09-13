import { Component, OnInit } from '@angular/core';
import{FormGroup,FormControl}from '@angular/forms';
import{Router}from '@angular/router';
import { AdminService } from '../Services/admin.service';
@Component({
  selector: 'app-admin-add-amount',
  templateUrl: './admin-add-amount.component.html',
  styleUrls: ['./admin-add-amount.component.css']
})
export class AdminAddAmountComponent implements OnInit {

  constructor(private admin_service:AdminService,private router:Router) { }

  depositForm:FormGroup;
  ngOnInit(){

  this.depositForm=new FormGroup({
  accountNo:new FormControl,
  
  addAmount:new FormControl

});
}
usr_response:any;
submitForm() {
     
  
  console.log(this.depositForm.value);
 this.admin_service.addAmount(this.depositForm.value).subscribe(resp=>this.usr_response=resp.json());


 
  alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.depositForm.value));
  this.depositForm.reset();
  this.router.navigate(['adminnext']);
} 
}
