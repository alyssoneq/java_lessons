/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissorslizardspock;

import java.util.Scanner;

/**
 * Program to play Rock, Paper, Scissors, Lizard and Spock
 * The rules are:
 *  Scissors beats paper
 *  paper beats rock
 *  rock beats lizard
 *  lizard beats spock
 *  spock beats scissors
 *  scissors beats lizard
 *  lizard beats paper
 *  paper beats spock
 *  spock beats rock
 *  rock beats scissors
 * 
 * @author Alysson Bruno
 */
public class RockPaperScissorsLizardSpock {

    public static void main(String[] args) {
    // Instance of the scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Getting how many rounds will be played
    System.out.println("Rock, Scissors, Paper, Lizard and Spock game");
        System.out.println("");
    System.out.println("Please type how many rounds will be played:");
    int rounds = userInput.nextInt();
    
    // Looping through each round
    for(int round = 1; round <= rounds; round++){
        
    System.out.println("- Round "+round);
    System.out.println("");
    System.out.println("Player one, choose: ");
    String playerOne = userInput.next();
    System.out.println("Player two, choose: ");
    String playerTwo = userInput.next();
    System.out.println("");
    
    System.out.println("The result of the round "+round+": "+winner(playerOne,playerTwo));
        System.out.println("");
        
    }
    
    }
    
    public static String winner(String playerOne, String playerTwo){
        String result = null;
        
        switch (playerOne){
            case "rock":
                switch (playerTwo){
                    case "lizard":
                    case "scissors":
                        result = "Player one is the winner";
                        break;
                    case "paper":
                    case "spock":
                        result = "player two is the winner";
                        break;
                    default: result = "draw";
                };
                break;
                
            case "paper":
                switch (playerTwo){
                    case "rock":
                    case "spock":
                        result = "Player one is the winner";
                        break;
                    case "scissors":
                    case "lizard":
                        result = "player two is the winner";
                        break;
                    default: result = "draw";
                };                
                break;
                
            case "scissors":
                switch (playerTwo){
                    case "lizard":
                    case "paper":
                        result = "Player one is the winner";
                        break;
                    case "rock":
                    case "spock":
                        result = "player two is the winner";
                        break;
                    default: result = "draw";
                };                
                break;
                
            case "lizard":
                switch (playerTwo){
                    case "spock":
                    case "paper":
                        result = "Player one is the winner";
                        break;
                    case "rock":
                    case "scissors":
                        result = "player two is the winner";
                        break;
                    default: result = "draw";
                };                
                break;
                
            case "spock":
                switch (playerTwo){
                    case "rock":
                    case "scissors":
                        result = "Player one is the winner";
                        break;
                    case "paper":
                    case "lizard":
                        result = "player two is the winner";
                        break;
                    default: result = "draw";
                };                
                break;
        }
        
        return result;
       
    }
    
}
