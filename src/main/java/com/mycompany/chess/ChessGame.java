
package com.mycompany.chess;

import java.util.Scanner;


public class ChessGame {
    
    private Board board;
    private Color currentturn;
    
    public ChessGame(){
        this.board = new Board();
        this.currentturn = Color.WHITE;
    }
    
    public void start(){
        
        Scanner sc = new Scanner(System.in);
        
        board.PrintBoard();
        System.out.println();
        
        while(true){
        //reading moves
        String moves = sc.nextLine().trim();

        if(moves.equalsIgnoreCase("exit")){
            break;
        }
        
        String[] ipts = moves.split(" ");
        
        if(ipts.length != 2){
            System.out.println("Invalid move");
            continue;
        }
        
        String srt = ipts[0];
        String end = ipts[1];
        
        int[] start = ChangeRowCol.toCoordinates(srt);
        int[] ends = ChangeRowCol.toCoordinates(end);
        
        Pieces piece = board.getPieceAt(start);
         
        //checking piece exits and belogs to current color turn
        if(piece==null || piece.getPiececol()!=currentturn){
            System.out.println("Invalid move");
            continue;
        }
        
        //checking if the move is valid
        if(!piece.isValidMove(board, start, ends)){
            System.out.println("Invalid Move");
            continue;
        }
        
        //moves the piece as it is valid
        board.movePiece(start, ends);
        
        
        //prints the board after the move
        board.PrintBoard();
        
        currentturn = (currentturn==Color.WHITE)?Color.BLACK:Color.WHITE;
        
        System.out.println();
        }
        
        sc.close();
    }
}
