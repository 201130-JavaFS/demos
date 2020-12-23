import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/models/pokemon';
import { PokemonService } from 'src/app/services/pokemon.service';

@Component({
  selector: 'app-pokedex',
  templateUrl: './pokedex.component.html',
  styleUrls: ['./pokedex.component.css']
})
export class PokedexComponent implements OnInit {
  public pokemon:Pokemon = null;
  public input:number = 0; 


  constructor(private ps:PokemonService) { }

  ngOnInit(): void {
  }

  getPoke():void{
    this.ps.getPokemonFromApi(this.input).subscribe(
      (data:Pokemon)=>{
        this.pokemon=data;
      },
      ()=>{
        this.pokemon=null;
        console.log("something went wrong trying to catch your pokemon.");
      }
    )
  }
}
