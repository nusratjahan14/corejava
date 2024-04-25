package teststring;

import java.util.Scanner;

public class TestString {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        // google id
//        System.out.println("Enter your email id");
//        String userEmail=a.next();
//        
//        String message=String.format("Welcome %s to Google",userEmail);
//        
//        
//        if(userEmail.equalsIgnoreCase("Java")){
//            System.out.println("Enter your password");
//            String password=a.next();
//            
//            if(password.equals("Java12345")){
//                System.out.println(message);
//            }
//            else{
//                System.out.println("Invalid Password Enter again");
//                String pass=a.next();
//                if(pass.equals("Java12345")){
//                    System.out.println(message);
//                }
//                else{
//                    System.out.println("Again Invalid password");
//                }
//            }
//        }
//        else{
//            System.out.println("couldn't find email id");
//        }


//          facebook id
        System.out.println("Enter your email address or phone number");
        String userName = a.next();
        System.out.println("Pls Enter ur password");
        String password= a.next();
        
        String message= String.format("Wlcome to facbook %s",userName);
        
        if(userName.equals("java") && password.length() >3 && password.length() <10){
            System.out.println(message);
            
            
        }
        else{
            System.out.println("Invalid username or password");
        }

        // name 

//          System.out.println("Enter your name");
//          String name=a.nextLine();
//          System.out.println("Welcome here, "+ name);

        // word task
        System.out.println("Enter your Name");
        String word=a.next().toUpperCase();
        if(word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")){
            System.out.println(word +  " Name is start with Vowel word.");
        }
        else{
            System.out.println(word + " Name is start with Consonent word.");
        }
        
        
    }

}
