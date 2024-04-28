package testbreakcontinue;

import java.util.Scanner;

public class TestBreakContinue {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

//        int sum = 0;
//        while (true) {
//            System.out.println("Enter Value");
//            int userInput = a.nextInt();
//            sum += userInput;
//
//            if (sum >= 200) {
//
//            } else if (sum >= 100) {
//                continue;
//            }
//            
//            System.out.println("Sum is" + sum);
//        }


        System.out.println("Enter start point");
        int startPoint = a.nextInt();
        System.out.println("Enter end point");
        int endPoint = a.nextInt();
        while (startPoint <= endPoint) {
            
            if (startPoint % 3 == 0 && startPoint % 5 == 0) {
                startPoint++;
                continue;
            
            }
            System.out.println(startPoint);
            startPoint++;
        }

    }

}
