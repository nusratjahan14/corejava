package math;

import java.math.BigInteger;

public class Factorial {

    int number = 0;

    

        public Factorial() {
        }

        public Factorial(int number) {
            this.number = number;
        }

        public BigInteger getFactorial() {

            BigInteger factorial = new BigInteger("1");

            for (int i = 1; i <= number; i++) {

                factorial = factorial.multiply(new BigInteger(i + ""));

            }

            return factorial;

        }

    
}
