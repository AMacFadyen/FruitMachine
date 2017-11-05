package com.example.alex.fruitmachine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Alex on 03/11/2017.
 */

public class Reel {

    private ArrayList<Symbol> collection;

    public Reel() {
        this.collection = new ArrayList<>();
        createReel();
    }


    public void createReel() {
        for (SymbolRank symbolrank : SymbolRank.values()) {
            Symbol symbol = new Symbol(symbolrank);
            collection.add(symbol);
        }
    }

    public ArrayList<Symbol> getCollection() {
        return collection;
    }

    public void randomizeCollection(){
        Collections.shuffle(collection);
    }

    public Symbol getFirst(){
        return collection.get(0);
    }

    public int getReelValue(){
        return getFirst().getRankValue();
    }

}
