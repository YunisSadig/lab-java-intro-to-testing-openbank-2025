package com.example.game;



public  abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private final int originalHealth=100;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public Player(int lives, int strength, int health) {
        this.lives = lives;
        this.strength = strength;
        this.health = health;
    }
    public void decrementLive(){
        lives--;
        if(lives==0){
            System.out.println("The character is dead");
        }
        else{
            health=originalHealth;
        }
    }
    public void checkHealth() {
        if (health <= 0) {
            decrementLive();
        }
    }

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(
                playerToAttack.getHealth() - this.strength
        );
        playerToAttack.checkHealth();
    }
}
