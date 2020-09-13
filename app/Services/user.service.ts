import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import {Headers}from '@angular/http';
@Injectable({
  providedIn: 'root'
})
export class UserService {

url="http://localhost:8080/onlinebanking/webapi/user/";

  constructor(private _http:Http) { }

transferAmount(transfer:any){

  let debitAccNo=transfer.debitAccNo;
  let creditAccNo=transfer.creditAccNo;
  let addAmount=transfer.addAmount;

  let body={};
  body['debitAccNo']=debitAccNo;
  body['creditAccNo']=creditAccNo;
  body['addAmount']=addAmount;
  let header=new Headers({'Content-Type': 'application/json'});
      
  return this._http.post(this.url+"transferamount",body,{headers:header});

}

getMiniStatement(){}


accBalance(){}

reqMobileChange(change:any){

  let accountNo=change.accountNo;
  let oldMobileNo=change.oldMobNo;
  let newMobileNo=change.newMobNo;

  let body={};
  body['accountNo']=accountNo;
  body['oldMobileNo']=oldMobileNo;
  body['newMobileNo']=newMobileNo;
  
  let header=new Headers({'Content-Type': 'application/json'});
      
  return this._http.post(this.url+"reqmobilechange",body,{headers:header});

}

changePassword(pass:any){

  let accountNo=pass.accountNo;
  let oldPass=pass.oldpassword;
  let newPass=pass.newpassword;

  let body={};
 
  body['accountNo']=accountNo;
  body['oldPassword']=oldPass;
  body['newPassword']=newPass;
  



  let header=new Headers({'Content-Type': 'application/json'});
      
  return this._http.post(this.url+"changepass",body,{headers:header});


}

}
