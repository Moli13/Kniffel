package com.company;

public class FullHouseOption extends AbstractRollOption {
    @Override
    public int getPoints(int[] rolledDice) {

        boolean containsTwo = false, containsThree = false;
        for(int number : rolledDice) {
            if(number == 2) containsTwo = true;
            if(number == 3) containsThree = true;
        }

        if(containsTwo && containsThree)
            return 25;
        return 0;
    }
}
