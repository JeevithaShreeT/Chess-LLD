
package com.mycompany.chess;


public class Queen extends Pieces {
    
    
    
    Queen(Color colr, int[] currentpos){
        super(colr, currentpos);
    }
    
    public boolean isValidMove(Board board, int[] start, int[] end){
        
        Rook rook = new Rook(this.colr, this.currentpos);
        
        if(rook.isValidMove(board, start, end)){
            return true;
        }
        
        Bishop bishop = new Bishop(this.colr, this.currentpos);
        
        if(bishop.isValidMove(board, start, end)){
            return true;
        }
        
        return false;
    }
}
