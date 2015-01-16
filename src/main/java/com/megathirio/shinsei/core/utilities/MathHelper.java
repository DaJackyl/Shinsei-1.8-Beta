package com.megathirio.shinsei.core.utilities;

import java.util.Random;

public class MathHelper {

    public static int randomChance(){
        Random random = new Random();
        return random.nextInt(100) + 1;

    }

}
