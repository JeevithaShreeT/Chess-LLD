
package com.mycompany.chess;


public class Pawn extends Pieces {
    
    Pawn(Color colr, int[]currentpos){
        super(colr, currentpos);
    }

    @Override
    public boolean isValidMove(Board board, int[] start, int[] end) {
        
        int rowdiff = end[0]- start[0];
        int coldiff = Math.abs(start[1]-end[1]);
        
        Pieces target = board.getPieceAt(end);
        
        if(coldiff == 0){
            
            if(this.colr == Color.WHITE){
                if(rowdiff == -1 && target==null) return true;
                
                if(rowdiff == -2 && start[0]==6 && target==null && board.getPieceAt(new int[]{5, start[1]})==null){
                    return true;
                }
                
                
            }
            else{
                if(rowdiff == 1 && target==null) return true;
                
                if(rowdiff == 2 && start[0]==1 && target==null && board.getPieceAt(new int[]{2, start[1]})==null){
                    return true;
                }
            }
        }
        
        if(coldiff == 1 && Math.abs(rowdiff) == 1 && target!=null && target.getPiececol() != this.colr) {
            return true;
        }
        
        return false;
    }
    
    
    
    
}
