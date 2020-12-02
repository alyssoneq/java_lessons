/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaccisequence;

import java.util.Scanner;

/**
 * Program to display a number of the fibonacci sequence
 * The user types a number equivalent to the index of a number 
 * in the fibonacci sequence
 * The program calculates and display the number of the sequence
 * 
 * @author Alysson Bruno
 */
public class FibonnacciSequence {

    public static void main(String[] args) {
    // Instance of the Scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Getting the user input for the index
    System.out.print("Program to search for an element ");
    System.out.println("in the fibonacci sequence ");
    System.out.println("Type a number for the index of the element:");
    int number = userInput.nextInt();
    int result = fib(number);
    
    // Calling the function to calculate and then display the result
    System.out.println("The element of index "+number+" is: "+result);
    }
    
    /** 
     * Function to calculate the element of the fibonacci sequence from
     * a given index chosen by the user
     */
    public static int fib(int number){
    if(number <= 1) return number;
    return fib(number-1)+fib(number-2);
    }
}
