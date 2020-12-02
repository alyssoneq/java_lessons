/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequences;

/**
 * Program to calculate the sum of fractional numbers
 * The sum will go 1 + 1/2 + 1/3 + ... + 1/100
 * The code will use recursive programming
 * 
 * @author Alysson Bruno
 */
public class SequenceS {

    public static void main(String[] args) {
    // Explaining the program
    System.out.println("Program designed to make a sum of 100 elements");
    System.out.println("The sum of 1 + 1/2 + ... + 1/100 has a result of:");
    
    //%.2f is the notation to make the float displayed with 2 decimals digits
    System.out.printf("%.2f\n",sumS(100 , 1));
    }
    
    public static float sumS (float limit, float count){
        if (count < limit){
            return 1/count + sumS(limit, count + 1);
        }else{  
            return 1/count;
        }
    }
    
}
