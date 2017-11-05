package com.example.alex.fruitmachine;

import java.util.ArrayList;

/**
 * Created by Alex on 03/11/2017.
 */

public class FruitMachine {
    private String name;
    private ArrayList<Reel> gameDisplay;
    private int houseFunds;
    private int jackpot;

    public FruitMachine(String name, int houseFunds) {
        this.name = name;
        this.houseFunds = houseFunds;
        this.gameDisplay = new ArrayList<>();
        this.jackpot = 100;
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

    public int getHouseFunds() {
        return houseFunds;
    }

    public int getJackpot() {
        return jackpot;
    }

    public int getReelValue(Reel reel){
        return reel.getReelValue();
    }

    public void randomizeReels(){
        for(Reel reel: gameDisplay){
            reel.randomizeCollection();
        }
    }





    public int spin(){
        houseFunds += 4;
        randomizeReels();
        System.out.println("Rotation rolled the following: " + gameDisplay.get(0).getReelValue() + ", " + gameDisplay.get(1).getReelValue() + ", " + gameDisplay.get(2).getReelValue());
        if (checkThreeWin() == true){
            if (gameDisplay.get(0).getReelValue() == 8){
                System.out.println("Congratulations!!!! You won the Jackpot!");
                return jackpot;
            }
            System.out.println("Winner Winner Winner!");
            return ((gameDisplay.get(0).getReelValue()) * 3);
        }
        System.out.println("No such luck!");
        return 0;
    }

    public boolean checkThreeWin() {
        int firstReel = gameDisplay.get(0).getReelValue();
        int secondReel = gameDisplay.get(1).getReelValue();
        int thirdReel = gameDisplay.get(2).getReelValue();
        return (firstReel == secondReel) && (secondReel == thirdReel);
    }

}
