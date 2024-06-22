package it.ioprogrammatore.models.abstracts;

public abstract class Pokemon {
    protected String name;
    protected String type;
    protected int hp;
    protected int attackDamage;

    public Pokemon(String name, String type, int hp, int attackDamage) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void attack(Pokemon opponent) {
        System.out.println(this.name + " attacks " + opponent.name + "!");
        opponent.takeDamage(this.attackDamage);
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(this.name + " takes " + damage + " damage. Remaining HP: " + this.hp);
    }

    public void displayStatus() {
        System.out.println(this.name + " (" + this.type + ") - HP: " + this.hp);
    }
}
