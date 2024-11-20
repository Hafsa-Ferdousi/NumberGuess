
package guessthenumber;

import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {

   
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        
        Scanner sc = new Scanner(System.in);
        int userGuess = 0;
        
         System.out.println("Welcome to the Guess the Number Game! ");  
         
         while(userGuess!= randomNumber){
             System.out.println("Enter the Guess:");
             userGuess=sc.nextInt();
             
             if(userGuess>randomNumber){
                 System.out.println("Too high,try again.");
             }else if(userGuess < randomNumber){
                 System.out.println("Too low, try again.");
             }else{
                 System.out.println("Congratulations! You guessed the number correctly.");
             }
             
         }
        
    }
    
}
