/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printcommand;

/**
 * Project to practice the Print command
 * @author Alysson Bruno
 */
public class PrintCommand {
    public static void main(String[] args) {
    int x = 10;
    double y = 10.2;
    String firstName = "Alysson";
    String surName = "Oliveira";
    
    System.out.println("Message to display on screen!");
    //concatenation test
    System.out.println("Value of variable x is: " + x);
    System.out.println("Values of x and y are: " + x + " and " + y);
    System.out.println("Linha 1\nLinha 2");
    
    //Playing with special characters
    System.out.print("Number 1\n");
    System.out.println("\tNumber 2");
    System.out.println("\t\tNumber 3");
    System.out.println("Number 4 \\ Number 5");
    System.out.println("My name is: \"" + firstName + " " + surName + "\"" );
    }
    
}
