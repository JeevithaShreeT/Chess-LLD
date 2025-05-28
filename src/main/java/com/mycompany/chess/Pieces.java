
package com.mycompany.chess;


abstract class Pieces {
    
    Color colr;
    int currentpos[];
    
    Pieces(Color colr, int[] currentpos){
        this.colr = colr;
        this.currentpos = currentpos;
    }
    
    public Color getPiececol(){
        return this.colr;
    }
    
    public int[] getcurrentpos(){
        return this.currentpos;
    }
    
    public void setCurrentpos(int[] pos){
        this.currentpos = pos;
    }
    
    abstract boolean isValidMove(Board board, int[] start, int[] end);
}
