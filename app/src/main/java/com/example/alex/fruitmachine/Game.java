package com.example.alex.fruitmachine;

import java.util.Scanner;

/**
 * Created by Alex on 05/11/2017.
 */

public class Game {

    FruitMachine fruitMachine;
    Player player;

    public Game(FruitMachine fruitMachine, Player player) {
        this.fruitMachine = fruitMachine;
        this.player = player;
    }


    public String checkEveryonesFunds(){
        if (fruitMachine.getHouseFunds() <= fruitMachine.getJackpot()){
            return "Machine House funds require topping up";
        }
        if (player.getFunds() <= 4){
            return "Player does not have enough to play! Please source more credits.";
        }
        return "The Game is set! Time to Play!";
    }

    public void movesFunds(){
        if(fruitMachine.checkThreeWin() == true){
            player.addWinnings(fruitMachine.getDisplay().get(0).getReelValue());
        }
        System.out.println("Player has " + player.getFunds() + " remaining in his bank");
    }



    public void playAgain(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Try again?");
        String response = scan.next();
        while(response.equals("y")){
            player.haveAGamble();
            fruitMachine.spin();
            movesFunds();
            response = scan.next();
        }

    }




    public void gameStart(){
        System.out.println(checkEveryonesFunds());
        fruitMachine.spin();
//
        playAgain();

    }
}
