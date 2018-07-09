import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Pokemon } from '../../pokemon';
import { PokemonService } from '../../services/pokemon.service';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.css'],
  providers: [PokemonService]
})
export class PokemonComponent implements OnInit {

  id: string;
  myPokemon: Pokemon;

  public getPokemon() {

    this.pokeService.getPokemon(this.id).subscribe(data => this.myPokemon = data);

  }

  constructor(private pokeService: PokemonService) { }

  ngOnInit() {
  }

}
