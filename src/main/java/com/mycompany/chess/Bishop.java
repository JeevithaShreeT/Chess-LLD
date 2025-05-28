
package com.mycompany.chess;

public class Bishop extends Pieces{
    
    Bishop(Color colr, int[]currentpos){
        super(colr, currentpos);
    }
    
    
    public boolean isLeap(Board board, int[] start, int[] end){
        
        //moves upward
        if(start[0]<end[0]){
            //moves to right-up
            if(start[1]<end[1]){
                int j=start[1]+1; 
                for(int i=start[0]+1; i<end[0] && j<end[1]; i++){
                    Pieces piece = board.getPieceAt(new int[]{i,j});
                    
                    if(piece != null) return false;
                    j++;
                }
                }
            else{
                //moves to left-up
                int j = start[1]-1;
                  for(int i=start[0]+1; i<end[0] && j>end[1]; i++){
                      Pieces piece = board.getPieceAt(new int[]{i,j});
                      
                      if(piece != null) return false;
                      j--;
                  }
            }     
         }
        else if(start[0]>end[0]){
            //moves down-right
            if(start[1]<end[1]){
                int j=start[1]+1;
                for(int i=start[0]-1; i>end[0] && j<end[1]; i--){
                Pieces piece = board.getPieceAt(new int[]{i,j});
                
                if(piece !=null) return false;
                j++;
            }
            }
            else{
                //moves down-left
                int j = start[1]-1;
                for(int i=start[0]-1; i>end[0] && j>end[1]; i--){
                    Pieces piece = board.getPieceAt(new int[] {i,j});
                    
                    if(piece != null) return false;
                    j--;
                }
            }
        }
      
        return true;
    }
    
    
    @Override
    public boolean isValidMove(Board board, int[] start, int[] end){
        
         if (Math.abs(start[0] - end[0]) != Math.abs(start[1] - end[1])) return false;
        
         boolean leap = isLeap(board, start, end);
         
         Pieces target = board.getPieceAt(end);
         
         
         if((start[0] != end[0] || start[1]!=end[1]) && leap==true && target==null) return true;
         
         if((start[0] != end[0] || start[1]!=end[1]) && leap==true && target!=null && target.getPiececol()!= this.colr) return true;
         
         
        
        return false;
    }
}