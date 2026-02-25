package com.example;

import com.example.odd.numbers.OddNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OrderNumbersTesting {

    private OddNumbers oddNumbers;

    @BeforeEach
    public void setup(){
        oddNumbers=new OddNumbers();
    }
    @Test
    void returnsEmptyArrayWhenNIsZero() {
        assertArrayEquals(new int[]{}, oddNumbers.getOdds(0));
    }
    @Test
    void returnsEmptyArrayWhenNIsNegative() {
        assertArrayEquals(new int[]{}, oddNumbers.getOdds(-5));
    }
    @Test
    void returnsOneWhenNIsOne() {
        assertArrayEquals(new int[]{1}, oddNumbers.getOdds(1));
    }

    @Test
    void returnsOddsUpToFive() {
        assertArrayEquals(new int[]{1, 3, 5}, oddNumbers.getOdds(5));
    }

    @Test
    void returnsOddsUpToTen() {
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, oddNumbers.getOdds(10));
    }
}
