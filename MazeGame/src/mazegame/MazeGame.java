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
    private static final char INTERNAL_WALL1 = '=';
    private static final char INTERNAL_WALL2 = '+';
    private static final char AREA = ' ';
    private static final char SIZE = 10;
    private static final char BEGIN = 'B';
    private static final char END = 'E';
    private static char[][] board;
    private static final double CHANCE = 0.60;
    private static int beginRow;
    private static int beginColumn;
    private static int endRow;
    private static int endColumn;
           
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
                // Making the internal walls random
                if (Math.random() > CHANCE && Math.random() < 0.85) {
                    board[i][j] = INTERNAL_WALL1;
                }else if(Math.random() > 0.85){
                    board[i][j] = INTERNAL_WALL2;
                }else {
                    board[i][j] = AREA;
                }
                
            }
        
        }
        // Creating the beginning position of the game
        beginRow = generateNumber(1, SIZE/2 - 1);
        beginColumn = generateNumber(1, SIZE/2 - 1);
        board[beginRow][beginColumn] = BEGIN;
        
        // Creating the ending position of the game
        endRow = generateNumber(SIZE/2, SIZE - 2);
        endColumn = generateNumber(SIZE/2, SIZE - 2);
        board[endRow][endColumn] = END;
    }
    
    public static void printingMatrix() {
        // Looping through to print the maze board
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);              
            }
            System.out.println("");
        }
    }
    
    public static int generateNumber(int min, int max) {
        // Because Math.round returns a long data type, recast int
        int value = (int) Math.round(Math.random()*(max - min));
        return min+value;       
    }
    
}
