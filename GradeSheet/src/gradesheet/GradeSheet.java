
package gradesheet;

import java.util.Scanner;


public class GradeSheet {

    
    public static void main(String[] args) {
    
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Your Score: ");
        int grade=scan.nextInt();
        
//        if(grade>=80){
//            System.out.println("Your Grade is: A+");
//        }
//        else if(grade>=70){
//            System.out.println("Your Grade is: A");
//        }
//        else if(grade>=60){
//            System.out.println("Your Grade is: A-");
//        }
//        else if(grade>=50){
//            System.out.println("Your Grade is: B");
//        }
//        else if(grade>=40){
//            System.out.println("Your Grade is: C");
//        }
//        else if(grade>=33){
//            System.out.println("Your Grade is: D");
//        }
//        else{
//            System.out.println("Your Grade is: F");
//        }
        if(grade<=32){
            System.out.println("Your Grade is: F");
        }
        else if(grade<=39){
            System.out.println("Your Grade is: D");
        }
        else if(grade<=49){
            System.out.println("Your Grade is: C");
        }
        else if(grade<=59){
            System.out.println("Your Grade is: B");
        }
        else if(grade<=69){
            System.out.println("Your Grade is: A-");
        }
        else if(grade<=79){
            System.out.println("Your Grade is: A");
        }
        else{
            System.out.println("Your Grade is: A+");
        }
        
    }
    
}
