package program1.java;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		System.out.println("BEFORE SWAPPING");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of a:");
		int a= sc.nextInt();
		System.out.println("Enter The Value Of b:");
		int b= sc.nextInt();
		int c = a;
		a = b;
		b = c;
		
		System.out.println("AFTER SWAPPING");
		
		System.out.println("Your Number For a is:" +a);
		System.out.println("Your Number For b is:" +b);
		

	}

}
