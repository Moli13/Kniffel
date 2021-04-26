package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Kniffel {
    java.util.Random randomNumberGenerator;
    List<AbstractRollOption> options;
    final int numberOfDice;
    int playerPoints;

    public Kniffel() {
        this(new FullHouseOption(),
                new FullHouseOption(),
                new ThreePaschOption(),
                new FourPaschOption(),
                new SmallStreet(),
                new BigStreet(),
                new KniffelOption(),
                new ChanceOption(),
                new OneOption(),
                new TwoOption(),
                new ThreeOption(),
                new FourOption(),
                new FiveOption(),
                new SixOption());
    }

    public Kniffel(AbstractRollOption... paramOptions){
        randomNumberGenerator = new Random();
        this.options = Arrays.asList(paramOptions);
        numberOfDice = 5;
        playerPoints = 0;
    }

    public int chooseOption(int[] rolledDice) {
        return 0;
    }

    public int play() {
        for (int currentRound = 0; currentRound < options.size(); currentRound++){
            int[] rolledDice = rollDice(numberOfDice);
            int chosen = chooseOption(rolledDice);
            playerPoints += options.get(chosen).getPoints(rolledDice);
        }
        return playerPoints;
    }

    public int[] rollDice(int length) {
        int[] countNumber = new int[6];
        for (int i = 0; i < length; i++) {
            countNumber[randomNumberGenerator.nextInt(6)] += 1;
        }return countNumber;
    }
}
