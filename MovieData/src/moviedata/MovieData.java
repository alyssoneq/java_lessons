/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedata;

import java.util.Scanner;

/**
 * Program to receive and display data about movies
 * The code will implement a data structure class
 * 3 movies will be described by the user
 * In the end, the data will be displayed
 * 
 * @author Alysson Bruno
 */
public class MovieData {

    public static void main(String[] args) {
    // Scanner instance
    Scanner userInput = new Scanner(System.in);
    
    // Calling the method to get user input about the movies
    System.out.println("--- First movie ---");
    Movie movie1 = readData(userInput);
        System.out.println("");
    System.out.println("--- Second movie ---");
    Movie movie2 = readData(userInput);
        System.out.println("");
    System.out.println("--- Third movie ---");
    Movie movie3 = readData(userInput);
    
    // Displaying data on screen
    System.out.println("----------------------");
    System.out.println("--- Movie 1 on air ---");
    printMovie(movie1);
    System.out.println("--- Movie 2 on air ---");
    printMovie(movie2);
    System.out.println("--- Movie 3 on air ---");
    printMovie(movie3);
    System.out.println("----------------------");
    }

    // Method to get user input data
    public static Movie readData(Scanner userInput) {
    // Instance of the movie class
    Movie movie = new Movie();
    
    System.out.println("Please type the movie info below");
    System.out.println("- Type the name of the movie:");
    movie.name = userInput.nextLine();
    System.out.println("- Type the author name:");
    movie.author = userInput.nextLine();
    System.out.println("- Type the year of release:");
    movie.year = userInput.nextInt();
    userInput.nextLine();
    System.out.println("- Type the price of the movie:");
    movie.price = userInput.nextDouble();
    userInput.nextLine();
    System.out.println("- Type the movie rating:");
    System.out.println("G , PG, PG13, R, NC17 ");
    MovieRate rate = getRate(userInput.nextLine());
    movie.rate = nameRate(rate);
    
    
    return movie;
    
    }

    // Method to print any movie data
    private static void printMovie(Movie movie) {
    // Printing movie data
    System.out.println("   v     v   ");
    System.out.println("name: "+movie.name);
    System.out.println("author: "+movie.author);
    System.out.println("year: "+movie.year);
    System.out.println("price: "+movie.price);
    System.out.println("rating: "+movie.rate);
    System.out.println("   ^     ^   ");
    }
    
    // Method to select the rating from an enum
    private static MovieRate getRate(String rate) {
        MovieRate rateName = MovieRate.G;
        
        //Switch statement to select the right enum
        switch (rate){
            case "G":
                rateName = MovieRate.G;
                break;
            case "PG":
                rateName = MovieRate.PG;
                break;
            case "PG13":
                rateName = MovieRate.PG13;
                break;
            case "R":
                rateName = MovieRate.R;
                break;
            case "NC17":
                rateName = MovieRate.NC17;
                break;
        
        }
                
        return rateName;
    }

    // Method to get right name for the rating selected
    private static String nameRate(MovieRate rate) {
        String name = "G - General Audience";
        
        // Switch statement to get string matching the rating
        switch(rate){
            case G:
                name = "G - All ages";
                break;
            case PG:
                name = "PG - Not for children";
                break;
            case PG13:
                name = "PG-13: Not for children under 13";
                break;
            case R:
                name = "R - Under 17 requires adult";
                break;
            case NC17:
                name = "NC-17: No under 17 admitted";
                break;
        
        }
        
        return name;
    }
    
}
