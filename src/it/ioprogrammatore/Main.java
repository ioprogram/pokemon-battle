package it.ioprogrammatore;

import it.ioprogrammatore.models.FirePokemon;
import it.ioprogrammatore.models.WaterPokemon;
import it.ioprogrammatore.models.abstracts.Pokemon;

class Main {
    public static void main(String[] args) {
        // Create instances of different Pokémon types
        Pokemon charmander = new FirePokemon("Charmander", 100, 20);
        Pokemon squirtle = new WaterPokemon("Squirtle", 100, 15);

        // Display initial status
        charmander.displayStatus();
        squirtle.displayStatus();

        // Simulate a battle
        System.out.println("\nBattle Start!");
        while (charmander.getHp() > 0 && squirtle.getHp() > 0) {
            charmander.attack(squirtle);
            if (squirtle.getHp() > 0) {
                squirtle.attack(charmander);
            }
        }

        // Display final status
        System.out.println("\nBattle End!");
        charmander.displayStatus();
        squirtle.displayStatus();

        // Announce the winner
        if (charmander.getHp() > 0) {
            System.out.println(charmander.getName() + " wins!");
        } else {
            System.out.println(squirtle.getName() + " wins!");
        }
    }
}
