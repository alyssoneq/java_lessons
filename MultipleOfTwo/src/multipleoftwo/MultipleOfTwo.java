/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleoftwo;

import java.util.Scanner;

/**
 *
 * @author Alysson Bruno
 */
public class MultipleOfTwo {

    public static void main(String[] args) {
    // Instance of the scanner method
    Scanner userInput = new Scanner(System.in);
    
    // User input registration
    System.out.println("Please type 5 numbers");
    System.out.println("Number 1: ");
    int n1 = userInput.nextInt();
    System.out.println("Number 2: ");
    int n2 = userInput.nextInt();
    System.out.println("Number 3: ");
    int n3 = userInput.nextInt();
    System.out.println("Number 4: ");
    int n4 = userInput.nextInt();
    System.out.println("Number 5: ");
    int n5 = userInput.nextInt();
    
    // Test to identify if the sum of given numbers is a multiple of 2
    int sumN = n1 + n2 + n3 + n4 + n5;
    if (sumN % 2 == 0){
        System.out.println("The sum of given numbers is a multiple of 2");
    }else{
        System.out.println("The sum of given numbers is not a multiple of 2");
    }
    }
    
}
