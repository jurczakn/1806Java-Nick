import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ChickenComponent } from './components/chicken/chicken.component';
import { RoosterComponent } from './rooster/rooster.component';

@NgModule({
  declarations: [
    AppComponent,
    ChickenComponent,
    RoosterComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
