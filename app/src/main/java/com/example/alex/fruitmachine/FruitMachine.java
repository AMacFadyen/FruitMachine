package com.example.alex.fruitmachine;

import java.util.ArrayList;

/**
 * Created by Alex on 03/11/2017.
 */

public class FruitMachine {
    private String name;
    private ArrayList<Reel> gameDisplay;
    private int funds;

    public FruitMachine(String name, int funds) {
        this.name = name;
        this.funds = funds;
        this.gameDisplay = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addReel(Reel reel){
        gameDisplay.add(reel);
    }

    public ArrayList<Reel> getDisplay() {
        return gameDisplay;
    }

    public int getFunds() {
        return funds;
    }
    
//    public boolean checkIfWin(){
//
//    }




}
