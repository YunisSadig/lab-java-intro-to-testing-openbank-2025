package com.example;

import com.example.game.SpellLibrary;
import com.example.game.Wizard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class WizardMockitoTest {
    private SpellLibrary spellLibraryMock;
    private Wizard wizard;

    @BeforeEach
    void setUp() {
        spellLibraryMock = mock(SpellLibrary.class);
        wizard = new Wizard(100, 20, 3, "Default", spellLibraryMock);
    }

    @Test
    void castRandomSpellCallsLibraryOnceAndReturnsCorrectString() {

        when(spellLibraryMock.getRandomSpell()).thenReturn("Fireball");

        String result = wizard.castRandomSpell();

        assertEquals("Casting Fireball", result);
        verify(spellLibraryMock, times(1)).getRandomSpell();
    }

}
