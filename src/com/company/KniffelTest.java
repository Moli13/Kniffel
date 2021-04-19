package com.company;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KniffelTest {

    @org.junit.Test
    public void wuerfelZahlen() {
        Kniffel game= new Kniffel();
        int laenge =6;
        int[] res= game.wuerfelZahlen(laenge);
        System.out.println(Arrays.toString(res));
        assertTrue(res.length== laenge);
        for(int i =0; i < res.length; i++) {
            assertTrue(res[i] > 0 && res[i] < 7);
        }
    }
}