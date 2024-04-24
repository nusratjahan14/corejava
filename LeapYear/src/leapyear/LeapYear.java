
package leapyear;

import java.util.Scanner;


public class LeapYear {


    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Year: ");
        
        int leapYear=scan.nextInt();
        if(leapYear % 4==0 && leapYear % 100!=0 || leapYear % 400==0){
            System.out.println(leapYear+ " year is  leapyear.");
        }
        else{
            System.out.println(leapYear+ " year is not leapyear.");
        }
    }
    
}
