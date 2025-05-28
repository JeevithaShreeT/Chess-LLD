
package com.mycompany.chess;


public class ChangeRowCol {

     public static int[] toCoordinates(String pos){
         int col = pos.charAt(0) - 'a';
         int row = 8-Character.getNumericValue(pos.charAt(1));
         
         return new int[]{row, col};
     }
    
     public static String toNotation(int[] pos){
         char col = (char)('a' + pos[1]);
         int row = 8 - pos[0];
         
         return ""+col+row;
     }
}
