package lesson16.game.metod;

import lesson16.game.Dice;

public class NewRoll implements Dice {
    int count = 1;


    @Override
    public int roll() {
        if (count == 1) {
            count++;
            return 6;
        } else return 1;
    }
}
