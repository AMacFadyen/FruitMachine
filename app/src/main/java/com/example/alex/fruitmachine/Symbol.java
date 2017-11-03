package com.example.alex.fruitmachine;

/**
 * Created by Alex on 03/11/2017.
 */

public class Symbol {

    private SymbolRank symbolRank;

    public Symbol(SymbolRank symbolRank){
        this.symbolRank = symbolRank;
    }

    public SymbolRank getSymbolRank() {
        return symbolRank;
    }

    public int getRankValue(){
        return symbolRank.getValue();
    }
}
