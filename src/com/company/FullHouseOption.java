package com.company;

public class FullHouseOption implements IRollOption {
    @Override
    public int getPoints(int[] rolledDice) {
        int[] countNumber = new int[6];
        for(int rolledNumber : rolledDice){
            countNumber[rolledNumber-1] += 1;
        }
        boolean containsTwo = false, containsThree = false;
        for(int number : countNumber) {
            if(number == 2) containsTwo = true;
            if(number == 3) containsThree = true;
        }

        if(containsTwo && containsThree)
            return 25;
        return 0;
    }
}
