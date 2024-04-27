
package testloops;

import java.util.Scanner;

public class TestLoops {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter start point");
        int startPoint =scan.nextInt();
        System.out.println("Enter end point");
        int endPoint =scan.nextInt();
        while (startPoint<=endPoint) {    
            if(startPoint%3 ==0 && startPoint%5 ==0){
            
            }
            else{
                System.out.println(startPoint);
            }
            startPoint++;
           
//            if(startPoint%3 !=0 || startPoint%5 !=0){
//                System.out.println(startPoint);
//            }
        }

            
            
    }
    
}
