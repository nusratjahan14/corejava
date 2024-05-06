
package testobjectthinking;

import math.Factorial;
import math.Prime;

public class TestObjectThinking {

    public static void main(String[] args) {
        Factorial f=new Factorial(5);
        
        System.out.println(f.getFactorial());
        
        Prime p=new Prime(9);
        System.out.println(p.checkPrime());
        
        
        
    }
    
}
