/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixprinter;

import java.util.Scanner;

/**
 * Project to print matrices of giving order by the user
 * The program will keep getting user input until the number 0 is given
 * 
 * @author Alysson Bruno
 */
public class MatrixPrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Instance of the Scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Getting user input of the order of a matrix
    int entry = userInput.nextInt();
        
    while (entry != 0){
        for (int row = 0; row < entry ; row++){
            for(int column = 0; column < entry; column++){
               
                if(row+column < entry){
                    // Logic for values above the matrix diagonal
                    System.out.printf("%3d" , min(row+1 , column+1));
                }else{
                    // Logic for values below the matrix diagonal
                    System.out.printf("%3d" , min(entry-row, entry-column));
                }
            }
            System.out.println("");
            
        }
        
        System.out.println("");
        entry = userInput.nextInt();
        System.out.println("");
    }
        
        
    }
    
    /** 
     * Function to decide which number to print
     * The lowest value received will be returned
     * 
     */
    public static int min(int a , int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }
    
    
    
}
