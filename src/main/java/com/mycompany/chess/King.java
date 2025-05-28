
package com.mycompany.chess;


public class King extends Pieces {
    
    public King(Color colr, int[] currentpos){
        super(colr, currentpos);
    }
    
    
    public boolean isValidMove(Board board, int[] start, int[] end){
        int rowdiff = start[0]-end[0];
        int coldiff = start[1]-end[1];
        
        Pieces target = board.getPieceAt(end);
        
        if(Math.abs(rowdiff)<=1 && Math.abs(coldiff)<=1 && (Math.abs(rowdiff) + Math.abs(coldiff)!=0)){
            if(target==null || target.getPiececol()!= this.colr){
                return true;
            }
        }
        
        return false;
    }
}
