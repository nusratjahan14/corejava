
package randomchargenerate;

import java.util.Random;

public class RandomCharGenerate {

    public static void main(String[] args) {
        
        String randomPass ="";
        for (int i=0; i<9; i++){
            
            if(i==4){
                randomPass += "-";
                continue;
                
            }
            
            randomPass += getRandomCharOrNumber();
        }
        System.out.println(randomPass);
    }
    
    public static  char getRandomCharOrNumber(){
    
        Random random = new Random();
        int choice = random.nextInt(1,4);
        
        char result = ' ';
        switch (choice) {
            case 1:
                int asciiNumber = random.nextInt(48,57);
                
                result= (char) asciiNumber;
                break;
            case 2:
                int asciiUpperCase = random.nextInt(65,90);
                
                result= (char) asciiUpperCase;
                break;
            case 3:
                int asciiLowerCase = random.nextInt(97,122);
                
                result= (char) asciiLowerCase;
                break;
        }
        return result;
    }
    
}
