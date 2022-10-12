package com.mycompany.pokepedia;

import pokemonClass.PokeDados;
import java.util.ArrayList;

public class Pokepedia {

    public static void main(String[] args) { 
        printPokemonAttributes(creatPokemons());
    }
    
    public static ArrayList<PokeDados> creatPokemons(){
        var pokemonsList = new ArrayList<PokeDados>();

        pokemonsList.clear();
        pokemonsList.add(new PokeDados("Bulbasaur","grass","poison",45,49,49,65,45));
        pokemonsList.add(new PokeDados("Ivysaur","grass","poison",60,62,63,80,60));
        pokemonsList.add(new PokeDados("Venusaur","grass","poison",80,82,83,100,80));
        pokemonsList.add(new PokeDados("Charmander","fire","None",39,52,43,50,65));
        pokemonsList.add(new PokeDados("Charmeleon","fire","None",58,64,58,65,80));
        pokemonsList.add(new PokeDados("Charizard","fire","flying",78,84,78,85,100));
        pokemonsList.add(new PokeDados("Squirtle","water","None",44,48,65,50,43));
        pokemonsList.add(new PokeDados("Wartortle","water","None",59,63,80,65,85));
        pokemonsList.add(new PokeDados("Blastoise","water","None",79,83,100,85,78));
           
        return pokemonsList;
    }
    
    public static void printPokemonAttributes(ArrayList<PokeDados> pokemonsList){
        //ArrayList<String> allPokemonAttributes = pokemonsList.get(0).getAllAttributes();
        for (PokeDados item : pokemonsList) {
            System.out.println("-----------------------------");
            System.out.println("********" + item.getPokeName().toUpperCase()+"********");
            System.out.println("-----------------------------");
            System.out.println("Pokemon Name: " + item.getPokeName());
            System.out.println("Pokemon Type: " + item.getPokeType1());
            System.out.println("Pokemon Type: " + item.getPokeType2());
            System.out.println("Pokemon Hp: " + item.getHp());
            System.out.println("Pokemon Attack: " + item.getAttack());
            System.out.println("Pokemon Defense: " + item.getDefense());
            System.out.println("Pokemon Special: " + item.getSpecial());
            System.out.println("Pokemon Speed: " + item.getSpeed()+"\n");
        }
    }
}
