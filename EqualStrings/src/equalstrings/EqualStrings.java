/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalstrings;

import java.util.Scanner;

/**
 * Program to determine if 2 given strings are equal
 * The code transforms all letters in the string into uppercase
 * At the end the code displays on the screen if the string are equal or not
 * 
 * @author Alysson Bruno
 */
public class EqualStrings {

    public static void main(String[] args) {
    // Instance of the Scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Getting user input of 2 strings
    System.out.println("Please type a word:");
    String word1 = userInput.nextLine();
    System.out.println("Please type another word:");
    String word2 = userInput.nextLine();
    
    // Converting all letter to uppercase
    word1 = word1.toUpperCase();
    word2 = word2.toUpperCase();
    
    // If statement to check equality of the given strings
    if(word1.equals(word2)){
        System.out.println("The 2 words are the same");
    }else{
        System.out.println("The 2 words are NOT the same");
    }
        System.out.println("");        
        System.out.println("The 2 words are:");
        System.out.println("- "+word1);
        System.out.println("- "+word2);
    
    }
    
}
