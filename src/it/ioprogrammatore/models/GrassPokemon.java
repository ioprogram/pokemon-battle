package it.ioprogrammatore.models;

import it.ioprogrammatore.models.abstracts.Pokemon;

public class GrassPokemon extends Pokemon {
    public GrassPokemon(String name, int hp, int attackDamage) {
        super(name, "Grass", hp, attackDamage);
    }
}

