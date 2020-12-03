/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howmanyleds;

import java.util.Scanner;

/**
 * Project to count the numbers of LEDs necessary to create a random number
 * The user types a number and the program will tell how many LEDs are needed
 * Each number has an amount of LEDs necessary to be displayed
 * 
 * @author Alysson Bruno
 */
public class HowManyLEDS {

    public static void main(String[] args) {
    // Instance of the Scanner method
    Scanner userInput = new Scanner(System.in);
    
    // Getting user input of how many entries 
    System.out.println("Please type how many entries you want:");
    int entries = userInput.nextInt();
    
    for(int i = 1 ; i <= entries; i++ ){
    // Getting user input of the chosen number
    System.out.println(" - For number entry "+i);
    System.out.println("Please type the number to create with LEDs:");
    String number = userInput.next();
        System.out.println("");
    
    // Displaying the number of LEDs necessary
    int numberLeds = countLeds(number);
    System.out.println("You need "+numberLeds+" leds");
        System.out.println("");
    }
    }
    
    public static int countLeds (String number){       
        // Counting the number of LEDs
        int Leds = 0;
        
        for(int i = 0 ; i < number.length() ; i++){
            switch (number.charAt(i)){
                case '2':
                case '3':
                case '5':
                    Leds += 5;
                    break;
                case '6':
                case '9':
                case '0':
                    Leds += 6;
                    break;
                case '1':
                    Leds += 2;
                    break;
                case '4':
                    Leds += 4;
                    break;
                case '7':
                    Leds += 3;
                case '8':
                    Leds += 7;
                    break;
            
            }
                    
        }
        
        return Leds;
    }
    
    
}
