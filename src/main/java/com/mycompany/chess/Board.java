
package com.mycompany.chess;


public class Board {

     private final int size = 8;
     private Cell[][] grid;
    
     Board(){
         grid = new Cell[size][size];
         for(int i=0; i<size; i++){
             for(int j=0; j<size; j++){
                 grid[i][j] = new Cell(i, j);
             }
         }
         
         initializeBoard();
     }
     
     public void initializeBoard(){
         //black pieces
         grid[0][0].setPiece(new Rook(Color.BLACK, new int[]{0,0}));
         grid[0][1].setPiece(new Knight(Color.BLACK, new int[]{0,1}));
         grid[0][2].setPiece(new Bishop(Color.BLACK, new int[]{0,2}));
         grid[0][3].setPiece(new Queen(Color.BLACK, new int[]{0,3}));
         grid[0][4].setPiece(new King(Color.BLACK, new int[]{0,4}));
         grid[0][5].setPiece(new Bishop(Color.BLACK, new int[]{0,5}));
         grid[0][6].setPiece(new Knight(Color.BLACK, new int[]{0,6}));
         grid[0][7].setPiece(new Rook(Color.BLACK, new int[]{0,7}));
         
         for(int i=0; i<size; i++){
             grid[1][i].setPiece(new Pawn(Color.BLACK, new int[]{1,i}));
         }
         
         //white pieces
         grid[7][0].setPiece(new Rook(Color.WHITE, new int[]{7,0}));
         grid[7][1].setPiece(new Knight(Color.WHITE, new int[]{7,1}));
         grid[7][2].setPiece(new Bishop(Color.WHITE, new int[]{7,2}));
         grid[7][3].setPiece(new Queen(Color.WHITE, new int[]{7,3}));
         grid[7][4].setPiece(new King(Color.WHITE, new int[]{7,4}));
         grid[7][5].setPiece(new Bishop(Color.WHITE, new int[]{7,5}));
         grid[7][6].setPiece(new Knight(Color.WHITE, new int[]{7,6}));
         grid[7][7].setPiece(new Rook(Color.WHITE, new int[]{7,7}));
         
         for(int i=0; i<size; i++){
             grid[6][i].setPiece(new Pawn(Color.WHITE, new int[]{6,i}));
         }
     }
     
     public Pieces getPieceAt(int[] pos){
        return grid[pos[0]][pos[1]].getPiece();
     }
     
     public void setPieceAt(int[] pos, Pieces piece){
         grid[pos[0]][pos[1]].setPiece(piece);
     }
     
     public void movePiece(int[] start, int[]end){
         Pieces piece = getPieceAt(start);
         setPieceAt(end, piece);
         setPieceAt(start, null);
         if(piece != null){
             piece.setCurrentpos(end);
         }
     }
     
     public void PrintBoard(){
         
         for(int i=0; i<size; i++){
             for(int j=0; j<size; j++){
                 Pieces piece = grid[i][j].getPiece();
                 
                 if(piece == null){
                     System.out.print("-- ");
                 }
                 else{
                     String col = (piece.getPiececol()== Color.WHITE)?"W":"B";
                     String type = "";
                     
                     if(piece instanceof Knight) type = "N";
                     else if(piece instanceof Rook)type="R";
                     else if(piece instanceof Bishop) type = "B";
                     else if(piece instanceof Queen) type = "Q";
                     else if(piece instanceof King) type = "K";
                     else if(piece instanceof Pawn) type = "P";
                     
                     System.out.print(col+type+" ");
                 }
             }
             System.out.println();
         }
         
         System.out.println();
     }
}
