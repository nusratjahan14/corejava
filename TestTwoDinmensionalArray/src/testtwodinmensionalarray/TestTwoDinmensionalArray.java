
package testtwodinmensionalarray;

public class TestTwoDinmensionalArray {

    public static void main(String[] args) {
        
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        
        int sum= doSumOfArray(nums);
        
        System.out.println("Sum- "+sum);
    }
    public static int doSumOfArray(int[][] myArray){
        int sum=0;
        for(int row=0; row< myArray.length; row++){
            
            for(int col=0; col< myArray[0].length; col++){
                
                sum+= myArray[row][col];
            }
        }
        return sum;
    }
    
}
