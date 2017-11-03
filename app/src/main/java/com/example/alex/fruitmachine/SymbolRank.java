package com.example.alex.fruitmachine;

/**
 * Created by Alex on 03/11/2017.
 */

public enum SymbolRank {
    APPLE(1),
    CAKE(2),
    DOLLAR(3),
    IRONFIST(4),
    CHERRY(5),
    LEMON(6),
    SEVEN(7),
    DIAMOND(8);

    private int value;

    SymbolRank(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }


}
