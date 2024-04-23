
package showcurrenttime;

public class ShowCurrentTime {

    public static void main(String[] args) {
      
//        long currentTime=System.currentTimeMillis();
//        
//        System.out.println(currentTime);
//        
//        long second= currentTime/1000;
//        System.out.println(second);
//        
//        long minites= second/ 60;
//        System.out.println(minites);
//        
//        long hours= minites/  60;
//        System.out.println(hours);
//        
//        long days= hours/ 24;
//        System.out.println(days);
//        
//        long years= days /365;
//        System.out.println(years);
        
        //book practice
        long totalMilliSecond= System.currentTimeMillis();
        
        long totalSeconds= totalMilliSecond/1000;
        
        long currentSecond= totalSeconds % 60;
        long totalMinute = totalSeconds/60;
        
        long currentMinute = totalMinute % 60;
        long totalHour = totalMinute / 60;
        
        long currentHour = totalHour % 24;
        
        System.out.println("Current Time is: "+ currentHour + ":" + currentMinute +":" + currentSecond);
        
        
    }
    
}
