
package testrandompassword;
import java.util.Random;

public class TestRandomPassword {

    public static void main(String[] args) {
        
        
        int length = 9;
        
        
        System.out.println(RandomPassword(length));
    }

    public static String RandomPassword(int length) {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
        
        Random random = new Random();
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            password[i] = chars[random.nextInt(chars.length)];
        }
        return new String(password);
        
        
        
    }
        
        
    
    
    
}
