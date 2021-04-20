package com.company;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KniffelTest {

    @org.junit.Test
    public void wuerfelZahlen() {
        Kniffel game = new Kniffel();
        int length = 6;
        int[] res = game.rollDice(length);
        System.out.println(Arrays.toString(res));
        assertEquals(res.length, length);
        for (int rolledNumber :
                res) {
            assertTrue(rolledNumber > 0 && rolledNumber < 7);
        }
    }
}