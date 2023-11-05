package program1.java;

import java.util.Scanner;

 public class Calculator {
	 

	
	public void add(int num1, int num2) {
		int add = num1+num2;
		System.out.println("Your Addition of Two Number is: " +add);	
	}
	
	public void add(int num1, int num2, int num3) {
		int add = num1+num2+num3;
		System.out.println("Your Addition of Two Number is: " +add);	
	}
	
	public void add(float num1, float num2) {
		float add = num1+num2;
		System.out.println("Your Addition of Two Number is: " +add);	
	}
	
	public void add(float num1, float num2, float num3) {
		float add = num1+num2+num3;
		System.out.println("Your Addition of Two Number is: " +add);	
	}
	
	public static void main (String[] args) 
	 {
		System.out.println("Enter Your Number choice \n 1.Integer \n 2.Float");
		Scanner z =new Scanner(System.in);
		 int input = z.nextInt();
		 
		 if(input == 1) {
			 System.out.println("Choose your calculation option \n 1.Add Two Number only \n 2.Add Three number only");
			    Scanner user =new Scanner(System.in);
			    int a = user.nextInt();
			    
			    if(a == 1) {
			    	System.out.println("Enter Your Number ");
					Scanner num =new Scanner(System.in);
					 int num1 = num.nextInt();
					 int num2 = num.nextInt();
					 
					 Calculator ob =new Calculator();
					 ob.add(num1, num2);
					 
			    }
			    
			    else if (a==2) {
			    	System.out.println("Enter Your Number ");
					Scanner y =new Scanner(System.in);
					 int num1 = y.nextInt();
					 int num2 = y.nextInt(); 
					 int num3 = y.nextInt();
					 
					 Calculator ob =new Calculator();
					 ob.add(num1, num2, num3);
					 
			    }
			    
			    else {
			    	System.out.println("Invalid Input");
			    }
		 }
		 else if(input == 2) {
			 
				 
			System.out.println("Choose your calculation option \n 1.Add Two Number only \n 2.Add Three number only");
			    Scanner user =new Scanner(System.in);
			    int a = user.nextInt();
			    
			    if(a == 1) {
			    	System.out.println("Enter Your Number ");
					Scanner x =new Scanner(System.in);
					 float num1 = x.nextInt();
					 float num2 = x.nextInt();
					 
					 Calculator ob =new Calculator();
					 ob.add(num1, num2);
					 
			    }
			    
			    else if (a==2) {
			    	System.out.println("Enter Your Number ");
					Scanner p =new Scanner(System.in);
					 float num1 = p.nextInt();
					 float num2 = p.nextInt(); 
					 float num3 = p.nextInt();
					 
					 Calculator ob =new Calculator();
					 ob.add(num1, num2, num3);
					 
			    }
			    
			    else {
			    	System.out.println("Invalid Input");
			    }
			    	
			    }	    
		 else {
			 System.out.println("Invalid Input");
		 }	
}
 }