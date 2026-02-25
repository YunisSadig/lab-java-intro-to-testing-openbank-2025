package com.example;

import com.example.game.Elf;
import com.example.game.SpellLibrary;
import com.example.game.Warrior;
import com.example.game.Wizard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTesting {
    private Warrior warrior;
    private Elf elf;
    private Wizard wizard;

    @BeforeEach
    void setUp() {

        SpellLibrary dummyLibrary = new SpellLibrary() {
            @Override
            public String getRandomSpell() {
                return "DummySpell";
            }
        };

        warrior = new Warrior(100, 20, 3, 50);
        elf = new Elf(80, 15, 2, 30);
        wizard = new Wizard(70, 25, 1, "Fireball",dummyLibrary);
    }
    @Test
    void attackReducesHealth(){
        warrior.attack(elf);
        assertEquals(60,elf.getHealth());
    }
    @Test
    void healthResetWhenLifeLost() {
        elf.setHealth(0);
        elf.checkHealth();
        assertEquals(1, elf.getLives());
        assertEquals(80, elf.getHealth());
    }

    @Test
    void deathWhenNoLivesLeft() {
        wizard.setHealth(0);
        wizard.checkHealth();
        wizard.setHealth(0);
        wizard.checkHealth();
        assertEquals(0, wizard.getLives());
    }

    @Test
    void warriorConvertsToElf() {
        Elf converted = warrior.convertToElf();
        assertEquals(warrior.getHealth(), converted.getHealth());
        assertEquals(warrior.getStrength(), converted.getStrength());
        assertEquals(warrior.getLives(), converted.getLives());
    }
    @Test
    void wizardConvertsToElf() {
        Elf converted = wizard.convertToElf();
        assertEquals(wizard.getHealth(), converted.getHealth());
        assertEquals(wizard.getStrength(), converted.getStrength());
        assertEquals(wizard.getLives(), converted.getLives());
    }
}
