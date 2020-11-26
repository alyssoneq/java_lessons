/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluatescore;

import java.util.Scanner;

/**
 * Code to evaluate if a given score
 * 
 * @author Alysson Bruno
 */
public class EvaluateScore {

    public static void main(String[] args) {
    // Instance of the Scanner
    Scanner userInput = new Scanner(System.in);
    
    // Getting the Score from the user
    System.out.println("Please type your score: ");
    int score = userInput.nextInt() ;
    
    // Evaluating the score using an if statement
    if(score > 0 && score < 3){
        System.out.println("You need to improve!!");
    }else if(score > 3 && score < 7){
        System.out.println("You are almost there!!");
    }else if(score > 7 && score < 9){
        System.out.println("You made it!!");
    }else if(score >= 9){
        System.out.println("You did a great performance!!");
    }
    }
    
}
