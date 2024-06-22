package it.ioprogrammatore.models;


import it.ioprogrammatore.models.abstracts.Pokemon;

public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int hp, int attackDamage) {
        super(name, "Water", hp, attackDamage);
    }
}

