/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureexample;

import java.util.Scanner;

/**
 * Program to exercise the data structure feature
 * This program will organize data about any address
 * 
 * @author Alysson Bruno
 */
public class DataStructureExample {

    public static void main(String[] args) {
    // Instance of the Scanner method
    Scanner userInput = new Scanner(System.in);
     
    // Getting data from user input
    System.out.println("----- Type your first address -----");
    Address address1 = readAddress(userInput);
    System.out.println("----- Type your second address -----");
    Address address2 = readAddress(userInput);
    
    // Printing data on screen
    System.out.println("----- Your first address is -----");
    printAddress(address1);
    System.out.println("----- Your first address is -----");
    printAddress(address2);
    
    }

    public static Address readAddress(Scanner userInput) {
    // Creating the data structure address
    Address address = new Address();
        
    // Getting data from user input
    System.out.println("- Please below fill your address info");
    System.out.println("Type the street:");
    address.street = userInput.nextLine();
    System.out.println("Type the number:");
    address.number = userInput.nextInt();
    userInput.nextLine();
    System.out.println("Type the neighborhood:");
    address.neighborhood = userInput.nextLine();
    System.out.println("Type the city:");
    address.city = userInput.nextLine();
    System.out.println("Type the state:");
    address.state = userInput.nextLine();
    System.out.println("Type the zip code:");
    address.zipCode = userInput.nextLine();
    
    return address;

    }

    public static void printAddress(Address address) {
    // Printing the address info   
    System.out.println(address.street+", "+address.number);
    System.out.println(address.neighborhood+", "+address.city+" - "+address.state);
    System.out.println("Zip Code: "+address.zipCode);
    }
    
    
    
}
