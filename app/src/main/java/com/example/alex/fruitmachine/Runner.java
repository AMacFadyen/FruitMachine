package com.example.alex.fruitmachine;

/**
 * Created by Alex on 05/11/2017.
 */

public class Runner {

    public static void main(String[] args) {

        Reel reel1 = new Reel();
        Reel reel2 = new Reel();
        Reel reel3 = new Reel();
        Player player1 = new Player("Ted", 30);
        FruitMachine fruitMachine = new FruitMachine("Boris's Luck", 150);
        fruitMachine.addReel(reel1);
        fruitMachine.addReel(reel2);
        fruitMachine.addReel(reel3);
        Game game = new Game(fruitMachine, player1);



        game.gameStart();

    }

}
