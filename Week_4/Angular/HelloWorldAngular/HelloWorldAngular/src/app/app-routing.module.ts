import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlertsComponent } from './components/alerts/alerts.component';
import { PokemonComponent } from './components/pokemon/pokemon.component';
import { ChickenComponent } from './components/chicken/chicken.component';

export const routes: Routes = [
    { path: '', redirectTo: 'chick', pathMatch: 'full' },
    { path: 'alerts', component: AlertsComponent },
    { path: 'poke', component: PokemonComponent },
    { path: 'chick', component: ChickenComponent }
];

@NgModule({
    imports: [ RouterModule.forRoot(routes) ],
    exports: [ RouterModule ]
})
export class AppRoutingModule {}
