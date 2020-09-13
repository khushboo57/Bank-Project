import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule, FormsModule,FormGroup} from '@angular/forms';
import { routes } from './app.route';
import { HttpModule } from '@angular/http';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { FaqComponent } from './faq/faq.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { ContactComponent } from './contact/contact.component';
//import { AdminnextComponent } from './adminnext/adminnext.component';
import { UserinfoComponent } from './userinfo/userinfo.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AdminnextComponent} from './admin-next/adminnext.component';
import { TransferMoneyComponent } from './transfer-money/transfer-money.component';
import { ViewministatementComponent } from './viewministatement/viewministatement.component';

import { PasswordchangeComponent } from './password-change/passwordchange.component';
import { RequestmobchangeComponent } from './request-mob-change/requestmobchange.component';
import { AdminMobileChangeComponent } from './admin-mobile-change/admin-mobile-change.component';
import { AdminCheckBalanceComponent } from './admin-check-balance/admin-check-balance.component';
import { AdminTransferAmountComponent } from './admin-transfer-amount/admin-transfer-amount.component';
import { AdminAddAmountComponent } from './admin-add-amount/admin-add-amount.component';

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    SignupComponent,
    LoginComponent,
    FaqComponent,
    AdminLoginComponent,
    //AdminnextComponent,
    UserinfoComponent,
    AboutusComponent,
    ContactComponent,
    AdminnextComponent,
    TransferMoneyComponent,
    ViewministatementComponent,
     PasswordchangeComponent,
     RequestmobchangeComponent,
     AdminMobileChangeComponent,
     AdminCheckBalanceComponent,
     AdminTransferAmountComponent,
     AdminAddAmountComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
