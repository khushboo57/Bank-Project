import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

import {Headers} from '@angular/http';
@Injectable({
  providedIn: 'root'
})
export class SignupService {

  url="http://localhost:8080/onlinebanking/webapi/user/adduser";

  constructor(private httpservice:Http) {

   
   }

   addUser(User:any)
   {
     let name=User.name;
     let mobile=User.mobile;
     let email=User.email;
     let aadharNo=User.aadharNo;
     let address=User.address;
     let password=User.password;
   
   let body={};
   body['name']=name;
   body['mobile']=mobile;
   body['email']=email;
   body['aadharNo']=aadharNo;
   body["address"]=address;
   body['password']=password;

   let header=new Headers({'Content-Type': 'application/json'});
       
   return this.httpservice.post(this.url,body,{headers:header});
}


       

}