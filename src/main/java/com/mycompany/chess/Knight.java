
package com.mycompany.chess;


public class Knight extends Pieces{
    
   public Knight(Color colr, int[] currentpos){
        super(colr, currentpos);
    }


    public boolean isValidMove(Board board, int[] start, int[] end){
        
        Pieces target = board.getPieceAt(end);
        
        int rowdiff = start[0]-end[0];
        int coldiff = start[1]-end[1];
        
        if((Math.abs(rowdiff)==2 && Math.abs(coldiff)==1)||(Math.abs(rowdiff)==1 && Math.abs(coldiff)==2)){
            if(target==null || target.getPiececol()!=this.colr){
                return true;
            }
        }
        
        return false;
    }
}
