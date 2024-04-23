
package farenheittocelsius;

import java.util.Scanner;


public class FarenheitToCelsius {

   
    public static void main(String[] args) {
      
        Scanner input =new Scanner(System.in);
        
        System.out.println("Plz enter the temperature of farenheit: ");
        
        float fertemp =input.nextFloat();
        float result =((fertemp-32)/9)*5;
        
        System.out.println("Temperature in Celsius: "+ result);
        
        
    }
    
}
