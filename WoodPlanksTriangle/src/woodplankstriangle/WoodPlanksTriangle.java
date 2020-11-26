/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woodplankstriangle;

import java.util.Scanner;

/**
 * Code to discover if 3 planks can be arranged as a triangle
 * This code get 3 lengths of wood planks
 * Depending on the planks length, the code determines if they can
 * be arranged as a triangle
 * 
 * @author Alysson Bruno
 */
public class WoodPlanksTriangle {

    public static void main(String[] args) {
    // Instance of the Scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Getting user input of the wood plank lenghts
    System.out.println("Please type the lenght of each wood plank below");
    System.out.println("Lenght of plank 1: ");
    double length1 = userInput.nextDouble();
    System.out.println("Lenght of plank 2: ");
    double length2 = userInput.nextDouble();
    System.out.println("Lenght of plank 3: ");
    double length3 = userInput.nextDouble();
    
    // If statement to determine if the planks can be arranged as a triangle
    if ((length1<(length2+length3))&&(length2<(length1+length3))&&(length3<(length1+length2))){
        System.out.println("The planks can be arranged as a triangle");
    }else{
        System.out.println("The planks cannot be arranged as a triangle");
    }
    }
    
}
