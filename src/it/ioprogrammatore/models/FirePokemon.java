package it.ioprogrammatore.models;


import it.ioprogrammatore.models.abstracts.Pokemon;

public class FirePokemon extends Pokemon {
    public FirePokemon(String name, int hp, int attackDamage) {
        super(name, "Fire", hp, attackDamage);
    }
}

