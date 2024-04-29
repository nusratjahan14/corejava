package testmethords;

import java.util.Scanner;

public class TestMethords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int primeNum = scan.nextInt();

        boolean result = doPrime(primeNum);
        
        if (result) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not prime number");
        }

    }

    public static boolean doPrime(int primeNum) {

        int count = 0;
        for (int i = 1; i <= primeNum; i++) {

            if (primeNum % i == 0) {
                count++;
            }
        }

        return count == 2;

    }
}
