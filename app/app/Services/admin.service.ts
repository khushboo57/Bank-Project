import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import{Headers} from '@angular/http';
@Injectable({
  providedIn: 'root'
})
export class AdminService {

  url="http://localhost:8080/onlinebanking/webapi/admin/";

  constructor(private _http:Http) { }

addAmount(amt:any){

  let accountNo=amt.accountNo;
  let amountToAdd=amt.addAmount;
console.log(amountToAdd);
  let body={};
   body['accountNo']=accountNo;
   body['amountToAdd']=amountToAdd;
   
  
  let header=new Headers({'Content-Type': 'application/json'});
  return this._http.post(this.url+"addamount",body,{headers:header});

}

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

checkBalance(accountno:any){

  return this._http.get(this.url+"showbalance/"+accountno);
}       

getMobRequest(){

  return this._http.get(this.url+"showmobilerequest");   

}

getBalance(acc:string){
  console.log(acc);
  return this._http.get(this.url+"showbalance/"+acc);//remove
}

}
