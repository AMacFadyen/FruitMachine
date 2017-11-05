package com.example.alex.fruitmachine;

/**
 * Created by Alex on 04/11/2017.
 */

public class Player {

    private String name;
    private int funds;

    public Player(String name, int funds) {
        this.name = name;
        this.funds = funds;
    }

    public String getName() {
        return name;
    }

    public int getFunds() {
        return funds;
    }

    public void addWinnings(int winnings){
        funds += winnings;
    }

    public void haveAGamble(){
        funds -= 4;
    }
}
