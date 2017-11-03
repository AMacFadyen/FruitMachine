package com.example.alex.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 03/11/2017.
 */

public class TestSymbol {

    Symbol symbol1;
    Symbol symbol2;

    @Before
    public void before(){
        symbol1 = new Symbol(SymbolRank.DIAMOND);
        symbol2 = new Symbol(SymbolRank.APPLE);
    }

    @Test
    public void testGetSymbolValue(){
        assertEquals(8, symbol1.getRankValue());
    }

    @Test
    public void testGetSymbol(){
        assertEquals(SymbolRank.APPLE, symbol2.getSymbolRank());
    }
}
