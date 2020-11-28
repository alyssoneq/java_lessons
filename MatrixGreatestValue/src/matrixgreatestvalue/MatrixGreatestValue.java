/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixgreatestvalue;

import java.util.Scanner;

/**
 * Program to receive a matrix by the user
 * The user can decide the size of the matrix
 * The user can input the data
 * At the end, the program will display the greatest
 * value of the matrix
 * 
 * @author Alysson Bruno
 */
public class MatrixGreatestValue {

    public static void main(String[] args) {
    
    // Instance of the Scanner Method
    Scanner userInput = new Scanner(System.in);
    
    // Getting the size of the matrix
    System.out.println("Please determine the size of your matrix");
    System.out.println("Please type the size of the rows:");
    int row = userInput.nextInt();
    System.out.println("Please type the size of the columns:");
    int column = userInput.nextInt();
    
        System.out.println("");
        System.out.println("");
    
    // Getting matrix data from user input
    int matrix[][] = new int[row][column];
    int greatest = 0;
    System.out.println("Please type the elements of the matrix");
    for (int i = 0; i < row; i++){
        int k = i + 1;
        System.out.println("Now for row number "+k);
        for (int j = 0; j < column; j++){
            System.out.println("Please type a number:");
            matrix[i][j] = userInput.nextInt();
            
            // if statement to get the greatest value of the matrix
            if(i == 0 && j == 0){
                greatest = matrix[i][j];
            }else if(matrix[i][j] > greatest){
                greatest = matrix[i][j];
            }
        }
        System.out.println("");
    }
    System.out.println("Thank you. Process finished");
    
    // Displaying the greatest value in the matrix
    System.out.println("The greatest value in your matrix is "+greatest);
    }
    
}
