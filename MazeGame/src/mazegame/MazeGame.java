/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

/**
 * Project to create a Maze Game in java
 * 
 * @author Alysson Bruno
 */
public class MazeGame {
    // Declaring constants to be used in the creation of the maze board
    private static final char VERTICAL_WALL = '|';
    private static final char HORIZONTAL_WALL = '-';
    private static final char AREA = ' ';
    private static final char SIZE = 10;
    private static char[][] board;
           
    public static void main(String[] args) {
        //Creating the board on screen
        board = new char[SIZE][SIZE];
        buildingMatrix();
        printingMatrix();
        
    }
    
    public static void buildingMatrix(){
        // Looping through to the external walls
        for (int i = 0; i < SIZE; i++){
            // Upper horizontal walls
            board[0][i] = HORIZONTAL_WALL;
            // Bottom horizontal walls
            board[SIZE-1][i] = HORIZONTAL_WALL;
            // Left vertical walls
            board[i][0] = VERTICAL_WALL;
            // Right vertical walls
            board[i][SIZE-1] = VERTICAL_WALL;
        }
        
        // Looping through internal board area
        for(int i = 1; i < SIZE - 1; i++){
            for(int j = 1; j < SIZE - 1; j++){
                board[i][j] = AREA;
            }
        
        }
    }
    
    public static void printingMatrix() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
    
}
