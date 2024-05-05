
package testclass;

import math.PrimeNumber;

public class TestClass {

    public static void main(String[] args) {
        
        
        PrimeNumber primeNumber= new PrimeNumber(2);
        
        String message =primeNumber.checkPrimeNumber();
        
        System.out.println(message);
    }
    
}
