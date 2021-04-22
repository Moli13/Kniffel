package com.company;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KniffelTest {

    @org.junit.Test
    public void wuerfelZahlen() {
        Kniffel game = new Kniffel();
        int numberDiceRolled = 6;
        int sum = 0;
        int[] res = game.rollDice(numberDiceRolled);
        System.out.println(Arrays.toString(res));
        assertEquals(res.length, 6);
        for (int rolledNumber :
                res) {
            sum += rolledNumber;
            assertTrue(rolledNumber >= 0);
        }
        assertEquals(numberDiceRolled, sum);

    }
}
