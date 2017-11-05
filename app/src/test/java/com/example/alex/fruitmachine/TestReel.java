package com.example.alex.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 03/11/2017.
 */

public class TestReel {

    Reel reel;

    @Before
    public void before(){
        reel = new Reel();
    }

    @Test
    public void testReelCreated(){
        assertEquals(8, reel.getCollection().size());
    }

    @Test
    public void testGetFirst(){
        assertEquals(SymbolRank.APPLE.getValue(), reel.getReelValue());
    }


}
