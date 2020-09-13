import { Component, OnInit } from '@angular/core';
import { AdminService } from '../Services/admin.service';

@Component({
  selector: 'app-adminnext',
  templateUrl: './adminnext.component.html',
  styleUrls: ['./adminnext.component.css']
})
export class AdminnextComponent implements OnInit {

  constructor(private admin:AdminService) { }

  ngOnInit() {
  }
  balance:any;
  
  showBalance(accountno:any)
  {
    console.log(accountno);
    this.admin.checkBalance(accountno).subscribe(resp=>this.balance=resp.json());
    console.log(this.balance);
  }

}
