
package guessnumber;

import java.util.Scanner;


public class GuessNumber {

    public static void main(String[] args) {
        
        
        Scanner a= new Scanner(System.in);
        int randorNumber=(int)(Math.random()*101);
        
        int maxAttempts =3;
        int attemtsCount =0;
        
        do{
            System.out.println("plz enter ur Guess Number");
            int guessNumber =a.nextInt();
            
            if(guessNumber==randorNumber){
                System.out.println("Congratulation");
                break;
            }
            else if(guessNumber>randorNumber){
                System.out.println("your guess is high");
            }
            else if(guessNumber<randorNumber){
                System.out.println("your guess is lower");
            }
            attemtsCount++;
        }
        
        while(attemtsCount<maxAttempts);
            
          
        if(attemtsCount==maxAttempts){
            System.out.println("Sorry you loss the game and guess number is "+randorNumber);
        }
        
        a.close();
    }
    
}
