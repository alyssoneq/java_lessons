/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summultiplycalculator;

import java.util.Scanner;

/**
 * Code to create a basic calculator
 * Mathematical operations supported by:
 *  - sum
 *  - multiplication
 * 
 * @author Alysson Bruno
 */
public class SumMultiplyCalculator {

    public static void main(String[] args) {
    // Instance of the scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Getting user input to decide which operation he/she wants
    System.out.println("Please choose which mathematical operation you want");
    System.out.println("Type A - Multiplication or B - Sum: ");
    String choice = userInput.nextLine();
    
    // Getting input of numbers to calculate
    System.out.println("Now Please type 2 numbers to perform a calculation:");
    System.out.println("Number 1:");
    int n1 = userInput.nextInt();
    System.out.println("Number 2:");
    int n2 = userInput.nextInt();
    
    int result;
    // if statement to evaluate and execute operation
    if (choice.equals("A")){
       result = n1*n2;
       System.out.println("The multiplication result is: "+result);
    }else {
        result = n1+n2;
        System.out.println("The sum result is: "+result);
    }
    }
    
}
