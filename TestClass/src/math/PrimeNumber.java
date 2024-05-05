
package math;


public class PrimeNumber {
    
    int userInput= 0;
    
    public PrimeNumber(){
    
    }
    
    public PrimeNumber(int newUserInput){
        this.userInput= newUserInput;
        
    }
    
    public String checkPrimeNumber(){
        int count=0;
        
        for(int i= 1; i<= userInput;i++){
            if(userInput %i ==0){
             count++;
            }
        }
        
        if(count==2){
         return "Its prime Number";
        }
        else{
            return "It's not Prime Number";
        }
    }
}
