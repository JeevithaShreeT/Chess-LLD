
package com.mycompany.chess;


public class Rook extends Pieces {
    
    Rook(Color colr, int[] currentpos){
        super(colr, currentpos);
    }
    
    public boolean isleap(Board board, int[] start, int[] end){
        
        // for the row leap presence, left
        for(int i=start[1]+1; i<end[1]; i++){
            Pieces piece = board.getPieceAt(new int[]{start[0], i});
            
            if(piece != null){
                return false;
            }
        }
        
        //for row leap presence, right
        for(int i=start[1]-1; i>end[1]; i--){
            Pieces piece = board.getPieceAt(new int[]{start[0], i});
            
            if(piece != null){
                return false;
            }
        }
        
        //for column leap presence, forward
        for(int i=start[0]+1; i<end[0]; i++){
            Pieces piece = board.getPieceAt(new int[]{i, start[1]});
            
            if(piece != null){
                return false;
            }
        }
        
        //for column leap presence, backward
        for(int i=start[0]-1; i>end[0]; i--){
            Pieces piece = board.getPieceAt(new int[]{i, start[1]});
            
            if(piece != null){
                return false;
            }
        }
               
        return true;
    }
    
    
    @Override
    public boolean isValidMove(Board board, int[] start, int[] end){
        
        Pieces target = board.getPieceAt(end);
        
        boolean leap = isleap(board, start, end);
        
        if((start[0]==end[0] || start[1]==end[1]) && target!=null && leap==true && target.getPiececol()!= this.colr){
            return true;
        }
        
        
        if((start[0]==end[0] || start[1]==end[1]) && target==null && leap==true) return true;
        
      
        return false;
    }
}
