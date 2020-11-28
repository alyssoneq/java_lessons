/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorearray;

import java.util.Scanner;

/**
 * Program using arrays to read students scores 
 * 
 * @author Alysson Bruno
 */
public class ScoreArray {

    public static void main(String[] args) {
    
    // Instance of the Scanner method
    Scanner userInput = new Scanner(System.in);
    
    // For loop to process the user input
    System.out.println("Please type below how many scores you are going to insert: ");
    int size = userInput.nextInt();
    double scores[] = new double[size];
    for (int i = 0; i < size; i++) {
        System.out.println("Type the score of the student " + i);
        scores[i] = userInput.nextDouble();
    }
    
    // For loop to print every score
    System.out.println("The scores are:");
    for (int i = 0; i < size; i++){
        int j = i + 1;
        System.out.println("The score number "+j+" is "+scores[i]);
    }
    }
    
}
