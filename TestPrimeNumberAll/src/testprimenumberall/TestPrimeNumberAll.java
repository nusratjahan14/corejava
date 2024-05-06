
package testprimenumberall;

import java.util.Scanner;
import java.util.Arrays;

public class TestPrimeNumberAll {

    public static void main(String[] args) {
//        Scanner scan= new Scanner(System.in);
//        System.out.println("Enter start num");
//        int[] startNum= new int[1];
        
        int[] endNum= new int[100];
        
        
        
        
        for(int i=1; i< endNum.length; i++){
            
            endNum[i]=i+1;
            
        }
        int[] result= rangeOfPrimeNum(endNum);
        System.out.println(Arrays.toString(result));
    
    }
    
    public static int[] rangeOfPrimeNum(int[] myArray){
    
        int[] newArray = new int[30];
        int index=0;
        
        for(int item: myArray){
            
            int count=0;
            for(int i=1; i <= item; i++){
                if(item%i ==0){
                    count++;
                }
            }
            
            if( count== 2){
                newArray[index]= item;
                index++;
            }
        }
        return newArray;
    }
}
