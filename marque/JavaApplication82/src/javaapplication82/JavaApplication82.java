
package javaapplication82;
import java.util.Scanner;

public class JavaApplication82 {

   
    public static void main(String[] args) {
      int secretNum;
    int geuss;
    boolean correct = false;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.print("GIVE ME SECRET NUMBER");
    secretNum = keyboard.nextInt();
    
    while (!correct) {
    
    System.out.println("GEUSS: ");
            geuss = keyboard.nextInt();
            if (geuss == secretNum); {
                correct = true;
                System.out.println("YOU ARE RIGHT!");
            }
            if (geuss < secretNum) {
                    geuss = keyboard.nextInt();
                System.out.println("HIGHER");
                
            }
             if (geuss > secretNum) {
                    geuss = keyboard.nextInt();
                System.out.println("LOWER");
             }
        }
    
    }
}