/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 * Program to create a TicTacToe game
 * 
 * @author Alysson Bruno
 */
public class TicTacToe {
    // Initial elements of the game 
    private static int currentPlayer, row, column, winner;
    private static int[][] spot = new int[3][3];
    
    // Instance of the Scanner
    private static Scanner userInput = new Scanner(System.in);
   
    public static void main(String[] args) {
        // to be implemented
        game();
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
    
}
