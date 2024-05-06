
package math;

import java.math.BigInteger;



public class Prime {
    int number=1;
    
    public Prime(){
    
    }
    public Prime(int number){
        this.number=number;
    }
    public boolean checkPrime(){
        
        BigInteger prime= BigInteger.valueOf(number);
        
        int count=0;
        
        for(BigInteger i= BigInteger.ONE; i.compareTo(prime)<= 0; i= i.add(BigInteger.ONE)){
        
            if(prime.remainder(i).equals(BigInteger.ZERO)){
                count++;
            }
        }
        return count==2;
    
    }
}
