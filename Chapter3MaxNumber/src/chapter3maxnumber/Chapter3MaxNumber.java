
package chapter3maxnumber;

import java.util.Scanner;

public class Chapter3MaxNumber {

    public static void main(String[] args) {
       
        Scanner scan= new Scanner(System.in);
        int maxnumber;
        
        System.out.println("Enter 1st number");
        int firstNum=scan.nextInt();
        
        System.out.println("Enter 2nd number");
        int secondNum=scan.nextInt();
        
        System.out.println("Enter 3rd number");
        int thirdNum=scan.nextInt();
        
        if(firstNum> secondNum & firstNum> thirdNum){
        maxnumber= firstNum;
        }
        
        else if(secondNum> firstNum & secondNum> thirdNum){
        maxnumber= secondNum;
        }
        
        else {
        maxnumber= thirdNum;
        }
        
        System.out.println("Max Number is: "+ maxnumber);
        
    }
    
}
