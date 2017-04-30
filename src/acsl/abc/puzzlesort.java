/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acsl.abc;

/**
 *
 * @author MaxFritzhand
 */
public class puzzlesort {

    private String[] puzzle = new String[35];

   public void populateStringArray() {
       
        puzzle[0] = "1";
       
      
    }
    
       //displays board
    public static void displayBoard(char[][] board) {
    // loop for each row
    System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n---------");
    System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n---------");
    System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");

}
    
    
}