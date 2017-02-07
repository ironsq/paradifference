import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import {CoreComponent} from "./core/core.component";
import {LoginScreenComponent} from "./authentication/login-screen.component";
import {CoreService} from "./core/core.service";

@NgModule({
  declarations: [AppComponent, CoreComponent, LoginScreenComponent],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [CoreService],
  bootstrap: [AppComponent, CoreComponent, LoginScreenComponent]
})
export class AppModule { }
