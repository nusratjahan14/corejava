package computearea;

import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the value of radius");
//        int radius = input.nextInt();
//
//        double area = radius * radius * 3.1416;
//
//        System.out.println(area);



//        System.out.println("Plz enter the value of length");
//        int length = input.nextInt();
//        System.out.println("Now, plz enter the value oh width");
//        double width = input.nextDouble();
//        
//        double area = length * width;
//        System.out.println(area);
        
        
        System.out.println("Enter number 1");
        double number1 = input.nextDouble();
        System.out.println("Enter number 2");
        double number2 = input.nextDouble();
        System.out.println("Enter number 3");
        double number3 = input.nextDouble();
        System.out.println("Enter number 4");
        double number4 = input.nextDouble();
        
        double sum = number1 + number2 + number3 + number4;
        System.out.println("Total " +sum);
    }

}
