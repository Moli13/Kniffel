package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FullHouseOptionTest {

    @Test
    public void getPointsWithFullHouse() {
        FullHouseOption fullHouseOption = new FullHouseOption();
        int[] rolledDice = new int[]{2,2,3,2,3};
        assertEquals(25, fullHouseOption.getPoints(rolledDice));
    }

    @Test
    public void getPointsWithoutFullHouse() {
        FullHouseOption fullHouseOption = new FullHouseOption();
        int[] rolledDice = new int[]{2,4,3,2,3};
        assertEquals(0, fullHouseOption.getPoints(rolledDice));
    }
}