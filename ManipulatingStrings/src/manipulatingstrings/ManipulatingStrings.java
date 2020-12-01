/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulatingstrings;

import java.util.Scanner;

/**
 * Program to manipulate strings
 * In this program the methods used are:
 * - toCharArray()
 * - charAt()
 * - indexOf()
 * - substring(,)
 * @author Alysson Bruno
 */
public class ManipulatingStrings {

    public static void main(String[] args) {
    // Instance of the Scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Getting user input for a name
    System.out.println("Please!! Type a name:");
    String name = userInput.nextLine();
    
    // Code to print the given word backwards
    char characters[] = name.toCharArray();
    System.out.println("The given name spelled backwards:");
    for(int i = (characters.length - 1);i >= 0;i--){
        System.out.print(characters[i]);
    }
        System.out.println("");
        System.out.println("");
    
    // Another code to spell backwards the same given word
    System.out.println("Lets do it again");
    System.out.println("The same name backwards:");
    for(int i = name.length() ; i >= 0; i--){
        System.out.print(name.charAt(i));
    }
    
        System.out.println("");
        System.out.println("");
        
    // Code 
    }
    
}
