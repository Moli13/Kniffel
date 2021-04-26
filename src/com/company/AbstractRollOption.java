package com.company;

public abstract class AbstractRollOption {
    private boolean used;
    public boolean getUsed() {
        return used;
    }

    public void setUsed(){
        used = true;
    }

    public abstract int getPoints(int[] rolledDice);
}
