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
 * UPDATE:
 *  implemented 2 new functions:
 *      - subtract
 *      - divide
 * 
 * @author Alysson Bruno
 */
public class SumMultiplyCalculator {

    public static void main(String[] args) {
    // Instance of the scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Getting user input to decide which operation he/she wants
    System.out.println("Please choose which mathematical operation you want");
    System.out.println("Type A for Multiplication / B for Sum / C for subtraction / D for division: ");
    String choice = userInput.nextLine();
    
    // Getting input of numbers to calculate
    System.out.println("Now Please type 2 numbers to perform a calculation:");
    System.out.println("Number 1:");
    float n1 = userInput.nextFloat();
    System.out.println("Number 2:");
    float n2 = userInput.nextFloat();
    
    float result;
    // if statement to evaluate and execute operation
    if (choice.equals("A")){
       result = n1*n2;
       System.out.println("The multiplication result is: "+result);
    }else if(choice.equals("B")){
        result = n1 + n2;
        System.out.println("The sum result is: "+result);
    }else if(choice.equals("C")){
       result = n1 - n2;
       System.out.println("The subtraction result is: "+result);
    }else if(choice.equals("D")){
       result = n1/n2;
       System.out.println("The division result is: "+result);
    }
    
    }
    
}
