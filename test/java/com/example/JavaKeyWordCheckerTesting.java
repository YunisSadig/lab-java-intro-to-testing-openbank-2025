package com.example;

import com.example.keyword.JavaKeyWordChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaKeyWordCheckerTesting {
    private JavaKeyWordChecker checker;
    @BeforeEach
    void setUp() {
        checker = new JavaKeyWordChecker();
    }

    @Test
    void returnsTrueWhenSentenceContainsKeyword() {
        assertTrue(checker.containsJavaKeyword("Don't break my heart"));
    }

    @Test
    void returnsFalseWhenKeywordIsPartOfAnotherWord() {
        assertFalse(checker.containsJavaKeyword("I love to breakdance"));
    }

    @Test
    void returnsFalseWhenNoKeywordExists() {

        assertFalse(checker.containsJavaKeyword("Hello world"));
    }

    @Test
    void detectsDifferentKeywords() {
        assertTrue(checker.containsJavaKeyword("public static void main"));
        assertTrue(checker.containsJavaKeyword("class is important"));
    }

    @Test
    void isCaseSensitiveLikeJavaKeywords() {
        assertFalse(checker.containsJavaKeyword("Break the rules"));
    }
}

