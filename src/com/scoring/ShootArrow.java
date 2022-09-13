package com.scoring;
import java.util.Random;

public class RandomScore {
    int min;
    int max;
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

    //constructor

    public Arrow () {
    }

    public Arrow (int int_random) {

    }

public int Score () {
    return int_random;
    }

}
