/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialcalculator;

import java.util.Scanner;

/**
 * Program to create a calculator for the factorial operation
 * The code uses recursive programming
 * 
 * @author Alysson Bruno
 */
public class FactorialCalculator {

    public static void main(String[] args) {
    // Instance of the Scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Getting user input to choose a number
    System.out.println("Please type a number to calculate its factorial");
    int number = userInput.nextInt();
    
    //Calling the function factorial to calculate
    int result = factorial(number);
    if (result > 0){
        System.out.println("The factorial of the number "+number+" is "+result);
    }else{
        System.out.println("There is no factorial for negative numbers!!");
    }
    
    }
    
    
    public static int factorial(int number){
    
    int result;
    if(number < 0){
        result = -1;
    }else if(number == 0){
        result = 1;
    }else{
        result = number*factorial(number-1);
    }
    
    return result;
    }
    
}
