/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 * Program to create a TicTacToe game
 * Every player will have their round to play
 * A player chooses the row and column of slot to be marked
 * At the end, the winner will be announced or a draw
 * 
 * @author Alysson Bruno
 */
public class TicTacToe {
    // Initial elements of the game 
    private static int currentPlayer, row, column, winner;
    private static int[][] spot = new int[3][3];
    private static String player1, player2;
    
    // Instance of the Scanner
    private static Scanner userInput = new Scanner(System.in);
   
    public static void main(String[] args) {
        // Recording the players names
        registry();
        
        // Loop to every board slot       
        for (int j = 0; j < 9; j++) {
            // Creating the board
            game();
            
            // Initiating the player turn
            if (j%2 == 0) {
                play(2);
            } else {
                play(1);
            }
            
            // Checking for a winner
            checkWinner();
            if (winner == 1 || winner == 2) {
                j = 10;
            }
        }
        
        // Generating the board one last time
        game();
        // Checking for win or draw
        if (winner == 1 ) {
            System.out.println("\n\nThe winner is "+player1);
        }else if( winner == 2){
            System.out.println("\n\nThe winnter is "+player2);
        }else {
            System.out.println("Draw");
        }
        
    }
    
    public static void drawOnBoard(int x, int y) {
        // If statement to define each player mark
        if (spot[x][y] == 1) {
            System.out.print("X");
        }else if (spot[x][y] == 2) {
            System.out.print("O");
        } else {
            System.out.print(" ");
        }
    }
    
    public static void game() {
        System.out.print("\n  1   2   3\n1 ");
        drawOnBoard(0, 0);
        System.out.print(" | ");
        drawOnBoard(0, 1);
        System.out.print(" | ");
        drawOnBoard(0, 2);
        System.out.print("\n -----------\n2 ");
        drawOnBoard(1, 0);
        System.out.print(" | ");
        drawOnBoard(1, 1);
        System.out.print(" | ");
        drawOnBoard(1, 2);
        System.out.print("\n -----------\n3 ");
        drawOnBoard(2, 0);
        System.out.print(" | ");
        drawOnBoard(2, 1);
        System.out.print(" | ");
        drawOnBoard(2, 2);
    }
    
    public static void play(int player) {
        // Initializing the counter
        int i = 0;
        // Determining the current player
        if (player == 1) {
            currentPlayer = 1;
            System.out.println("\n\n Player "+player1+" turn");
        } else {
            currentPlayer = 2;
            System.out.println("\n\n Player "+player2+" turn");
        }
        
        
        // While statement to get user choice
        while (i == 0) {            
            row = 0;
            column = 0;
            while (row < 1 || row > 3) {                
                System.out.print("Choose the row(1,2,3): ");
                row = userInput.nextInt();
                if (row < 1 || row > 3) {
                    System.out.println("Please choose a row between 1 and 3");
                }
            }
            
            while (column < 1 || column > 3) {                
                System.out.print("Choose the column(1,2,3):");
                column = userInput.nextInt();
                if (column < 1 || column > 3) {
                    System.out.println("Please choose a row between 1 and 3");
                }
            }
            
            // Making adjustments on the choices
            row -= 1;
            column -= 1;
            
            // If statement to check if the spot in the board is empty
            if (spot[row][column] == 0) {
                spot[row][column] = currentPlayer;
                i = 1;                
            } else {
                System.out.println("Spot already taken");
            }
            
        }
    }
    
    public static void checkWinner() {
        // Initializing the loop counter 
        int i;
        
        // If statement to check for a horizontal win
        for ( i = 0; i < 3; i++) {
            if (spot[i][0] == spot[i][1] && spot[i][0] == spot[i][2]) {
                if (spot[i][0] == 1) winner = 1;
                if (spot[i][0] == 2) winner = 2;
            }
        }
        
        // If statement to check for a vetical win 
        for ( i = 0; i < 3; i++) {
            if (spot[0][i] == spot[1][i] && spot[0][i] == spot[2][i]) {
                if (spot[0][i] == 1) winner = 1;
                if (spot[0][i] == 2) winner = 2;
            }
        }
        
        // If statement to check for a upper diagonal win
        if (spot[0][0] == spot[1][1] && spot[0][0] == spot[2][2]) {
            if (spot[0][0] == 1) winner = 1;
            if (spot[0][0] == 2) winner = 2;
        }
        
        
        // If statement to check for a bottom diagonal win
        if (spot[2][0] == spot[1][1] && spot[2][0] == spot[0][2]) {
            if (spot[2][0] == 1) winner = 1;
            if (spot[2][0] == 2) winner = 2;
        }

        
        
    }

    private static void registry() {
        // Registration process
        System.out.println("Hello!!");
        System.out.println("Please! Insert the name of each player");
        System.out.println("Player 1 name: ");
        player1 = userInput.nextLine();
        System.out.println("Player 2 name: ");
        player2 = userInput.nextLine();
        
        System.out.println("Thank you - Lets play!!");
    }
    
}
