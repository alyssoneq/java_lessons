/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printodds;

import java.util.Scanner;

/**
 * Code to create a loop to receive integers
 * The program will only print odds integers
 * 
 * @author Alysson Bruno
 */
public class PrintOdds {

    public static void main(String[] args) {
    // Instance of the scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Loop to get userInput and print odds integers only
    int n;
        System.out.println("Please type 10 numbers");
        System.out.println("If the given number is odd, then it will be printed");
    for(int i = 1;i<=10;i++){
        System.out.println("Please type a number");
        n = userInput.nextInt();
        if(n % 2 != 0){
            System.out.println("The number "+n+" is odd");
        }
    }
        System.out.println("The program is finished. Thank you");
    }
    
}
