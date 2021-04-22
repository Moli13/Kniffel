package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FullHouseOptionTest {

    @Test
    public void getPointsWithFullHouse() {
        FullHouseOption fullHouseOption = new FullHouseOption();
        int[] rolledDice = new int[]{2,0,3,0,0};
        assertEquals(25, fullHouseOption.getPoints(rolledDice));
    }

    @Test
    public void getPointsWithoutFullHouse() {
        FullHouseOption fullHouseOption = new FullHouseOption();
        int[] rolledDice = new int[]{2,0,2,1,0};
        assertEquals(0, fullHouseOption.getPoints(rolledDice));
    }

}