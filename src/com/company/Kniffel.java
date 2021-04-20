package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Kniffel {
    java.util.Random wuerfelWurf;
    List<IRollOption> options;
    final int numberOfDice;
    int playerPoints;

    public Kniffel() {
        this(new FullHouseOption(),
                new FullHouseOption(),
                new FullHouseOption(),
                new PaschOption(),
                new SmallStreet(),
                new BigStreet());
    }

    public Kniffel(IRollOption... paramOptions){
        wuerfelWurf = new Random();
        this.options = Arrays.asList(paramOptions);
        numberOfDice = 5;
        playerPoints = 0;
    }

    public int chooceOption(int[] rolledDice) {
        // TODO
        return 0;
    }

    public int play() {
        for (int currentRound = 0; currentRound < options.size(); currentRound++){
            int[] rolledDice = rollDice(numberOfDice);
            int chosen = chooceOption(rolledDice);
            playerPoints += options.get(chosen).getPoints(rolledDice);
        }
        return playerPoints;
    }

    public int[] rollDice(int length) {
        int[] zahlen = new int[length];
        for (int i = 0; i < length; i++) {
            zahlen[i] = wuerfelWurf.nextInt(6) + 1;
        }
        return zahlen;
    }
}
