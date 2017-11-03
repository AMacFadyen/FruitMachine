package com.example.alex.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 03/11/2017.
 */

public class TestFruitMachine {

    FruitMachine fruitMachine;
    Reel reel1;
    Reel reel2;
    Reel reel3;


    @Before
    public void before(){
        fruitMachine = new FruitMachine("Clover's Run", 500);
        fruitMachine.addReel(reel1);
        fruitMachine.addReel(reel2);
        fruitMachine.addReel(reel3);
    }

    @Test
    public void testNumberOfReel(){
        assertEquals(3, fruitMachine.getDisplay().size());
    }


}
