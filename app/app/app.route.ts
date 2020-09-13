import {Routes} from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { FaqComponent } from './faq/faq.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { UserinfoComponent } from './userinfo/userinfo.component';
//import { AdminnextComponent } from './adminnext/adminnext.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import{AdminnextComponent} from './admin-next/adminnext.component';
import { TransferMoneyComponent } from './transfer-money/transfer-money.component';
import { RequestmobchangeComponent } from './request-mob-change/requestmobchange.component';
import { PasswordchangeComponent } from './password-change/passwordchange.component';
import { ContactComponent } from './contact/contact.component';
import { AdminMobileChangeComponent } from './admin-mobile-change/admin-mobile-change.component';
import { AdminCheckBalanceComponent } from './admin-check-balance/admin-check-balance.component';
import { AdminTransferAmountComponent } from './admin-transfer-amount/admin-transfer-amount.component';
import { AdminAddAmountComponent } from './admin-add-amount/admin-add-amount.component';


export const routes : Routes=[

    {path:'',component:HomepageComponent},
    {path:'login',component:LoginComponent},
    {path:'signup',component:SignupComponent},
    {path:'faq',component:FaqComponent},
    {path:'adminlogin',component:AdminLoginComponent},
   {path:'login/userinfo',component:UserinfoComponent},
  {path:'adminlogin/adminnext',component:AdminnextComponent},
   {path:'aboutus',component:AboutusComponent},
   {path:'login/userinfo/transfermoney',component:TransferMoneyComponent},
   {path:'login/userinfo/reqmobilechange',component:RequestmobchangeComponent},
   {path:'login/userinfo/changepassword',component:PasswordchangeComponent},
   {path:'contact',component:ContactComponent},
   {path:'adminlogin/adminnext/viewmobreq',component:AdminMobileChangeComponent},
   {path:'adminlogin/adminnext/checkbalance',component:AdminCheckBalanceComponent},
   {path:'adminlogin/adminnext/transferamount',component:AdminTransferAmountComponent},
   {path:'adminlogin/adminnext/depositamount',component:AdminAddAmountComponent}
]