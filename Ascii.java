import java.util.*;
public class Ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:"); 
         char character=sc.next().charAt(0);
         int asciivalue=(int)character;
         System.out.println("ASCII value of "+character+" is "+asciivalue);
 
    }
    
}
