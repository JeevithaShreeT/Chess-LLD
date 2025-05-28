
package com.mycompany.chess;


public class Cell {

    private int row;
    private int col;
    private Pieces piece;
    
    Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.piece = piece;
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
    
    public Pieces getPiece(){
        return this.piece;
    }
    
    public boolean isCellEmpty(){
        return piece==null;
    }
    
    public void setPiece(Pieces piece){
        this.piece = piece;
    }
    
    
}
