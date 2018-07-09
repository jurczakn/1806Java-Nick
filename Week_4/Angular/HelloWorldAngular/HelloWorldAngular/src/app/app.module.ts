import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ChickenComponent } from './components/chicken/chicken.component';
import { RoosterComponent } from './rooster/rooster.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FailureComponent } from './components/failure/failure.component';
import { AlertsComponent } from './components/alerts/alerts.component';
import { FormsModule } from '../../node_modules/@angular/forms';
import { LoggingService } from './services/logging.service';
import { PokemonComponent } from './components/pokemon/pokemon.component';
import { PokemonService } from './services/pokemon.service';
import { HttpClientModule } from '../../node_modules/@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ChickenComponent,
    RoosterComponent,
    FailureComponent,
    AlertsComponent,
    PokemonComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    NgbModule.forRoot(),
    HttpClientModule
  ],
  providers: [LoggingService, PokemonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
