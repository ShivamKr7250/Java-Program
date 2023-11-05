package program1.java;

import java.util.Scanner;

public class Tax {
	
	public static void main(String args[])
	{
	System.out.println("Enter Your Total Income In year");
    Scanner income = new Scanner(System.in);
    int Income = income.nextInt();
    
    System.out.println("Enter Your Gender \n If You are men type 1 \n if you are women type 2");
    Scanner gender = new Scanner(System.in);
    int Gender = gender.nextInt();
    
    if (Gender == 1)
    {

        if (Income <= 180000)
        {
            System.out.println("No Tax"  );
        }

        else if ( Income <= 500000)
        {
        	int tax = (int) ((Income - 180000)*0.10);
        	System.out.println("Tax 10% " +tax);
        }

        else if (Income <= 800000)
        {
        	int tax = (int) ((500000*0.10)+ (Income-500000)*0.20);
        	System.out.println("Tax 20% " +tax);
        }
        else if (Income > 800000)
        {
        	int tax = (int) ((800000*0.20)+(Income-800000)*0.30);
        	System.out.println("Tax 30% " +tax);
        }
    }

    else if (Gender == 2)
    {

        if (Income <= 190000)
        {
        	System.out.println("No Tax");
        }

        else if ( Income <= 500000)
        {
        	int tax = (int) ((Income - 180000)*0.10);
        	System.out.println("Tax 10%");
        }

        else if (Income <= 800000)
        {
        	int tax = (int) ((500000*0.10)+ (Income-500000)*0.20);
        	System.out.println("Tax 20%");
        }
        else if (Income > 800000)
        {
        	int tax = (int) ((800000*0.20)+(Income-800000)*0.30);
        	System.out.println("Tax 30% " +tax);
        }
    }
    
    else {
    	System.out.println("Your Choosen the wrong input");
    }
	}
}

