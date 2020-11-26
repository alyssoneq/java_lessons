/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannercommand;

import java.util.Scanner;

/**
 * Project to play around with the scanner command
 * @author Alysson Bruno
 */
public class ScannerCommand {
    public static void main(String[] args) {
    // Instance of the Scanner
    Scanner userInput = new Scanner(System.in);
    
    // Sequence of user inputs
    System.out.println("Type your name:");
    String name = userInput.nextLine();
    System.out.println("Hello, "+name+", please type your age:");
    int age = userInput.nextInt();
    System.out.println(age+" years. Well done!!");
    System.out.println("Now please, type your height:");
    double height = userInput.nextDouble();
    System.out.println("Ok I got it. Your height is "+height+" m");
    
    // Code to receive 3 sentences from the user
    System.out.println("Please type 3 sentences below");
    System.out.println("Sentence1: ");
    String sentence1 = userInput.nextLine();
    System.out.println("Sentence2: ");
    String sentence2 = userInput.nextLine();
    System.out.println("Sentence3: ");
    String sentence3 = userInput.nextLine();
    System.out.println("The sentences are:  ");
    System.out.println("\t"+sentence3);
    System.out.println("\t"+sentence2);
    System.out.println("\t"+sentence1);
    }
    
}
