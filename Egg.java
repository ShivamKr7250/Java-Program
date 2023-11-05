
package program1.java;

import java.util.Scanner;


public class Egg{
    public static void main(String[] args)
    {
        System.out.println("Enter The Total Number Of eggs");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int gross = n/144;
        int x = n%144;
        int dozen = x/12;
        int y= x%12;

    System.out.println("Your number of eggs in Gross is: \n" +gross);
    System.out.println("Your number of eggs in Dozen is: \n" +dozen);
    System.out.println("Your number of eggs left is: \n" +y);

    }
    
}