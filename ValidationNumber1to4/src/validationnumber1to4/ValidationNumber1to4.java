/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validationnumber1to4;

import java.util.Scanner;

/**
 * Program to validate user input of an integer number
 * The program will print "invalid number" when 
 * the given number is not between 1 and 4
 * 
 * @author Alysson Bruno
 */
public class ValidationNumber1to4 {

    public static void main(String[] args) {
    // Instance of the Scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Loop to get user input and validate
    int n;
    do{
        System.out.println("Please type a number: ");
        n = userInput.nextInt();
        if(n < 1 || n > 4){
            System.out.println("Invalid Number");
        }
    }while(n < 1 || n > 4);
    System.out.println("The given number was: "+n);
    }
    
}
