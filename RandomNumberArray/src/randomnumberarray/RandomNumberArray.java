
package randomnumberarray;

import java.util.Random;

public class RandomNumberArray {

    public static void main(String[] args) {
        Random s= new Random();
        
        System.out.println("10 Random Number: ");
        double[] number = new double[10];
        
        randomNumber(number, s);
        
//        for(double i=0; i< 10; i++){
//            System.out.println(i+1);
//            number[i]= Math.random()*100;
//        }
        
//        double num = Math.random()*100 ;
    }
    public static void randomNumber(double [] number, Random s){
        for(int i=0; i< 10; i++){
            System.out.println(i+1);
            number[i]= s.nextInt();
        }
    }
    
}
