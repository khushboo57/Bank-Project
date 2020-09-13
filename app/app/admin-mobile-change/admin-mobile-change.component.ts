import { Component, OnInit } from '@angular/core';
import { AdminService } from '../Services/admin.service';

@Component({
  selector: 'app-admin-mobile-change',
  templateUrl: './admin-mobile-change.component.html',
  styleUrls: ['./admin-mobile-change.component.css']
})
export class AdminMobileChangeComponent implements OnInit {

  constructor(private _adminservice:AdminService) { }

  
  ngOnInit(){

this._adminservice.getMobRequest().subscribe(resp=>this.arr=resp.json());


}
arr=[];



}
