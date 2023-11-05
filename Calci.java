package program1.java;

import java.util.Scanner;

public class Calci {

	int num1,num2;
	
	 public void add(int a) {
		int add = num1 + num2;
		System.out.println("Your Addition of Two Number is: " +add);
	}
	
	 public void subtract() {
		int sub = num1 - num2;
		System.out.println("Your Subtraction of Two Number is: " +sub);
	}
  void multiply() {
		int multi = num1 * num2;
		System.out.println("Your Multiplication of Two Number is: " +multi);
	}
	
	void division(float a) {
		int div = num1/num2;
		System.out.println("Your Division of Two Number is: " +div);
	}
	void remainder() {
		int rem = num1%num2;
		System.out.println("Your Remainder of Two Number is: " +rem);
	}
}

class display {
	 public static void main (String[] args) 
	 {
		 System.out.println("Choose your Option for calculations /n 1.Addition /n 2.Subtraction /n 3.Multiplication /n 4.Division /n 5.Remainder");
		 Scanner user = new Scanner(System.in);
		 int input = user.nextInt();
		 
		 if(input==1) {
			 
		 }
		 else if(input==2) {
		 }
		 else if(input==3) {
		 }
		 else if(input==4) {
		 }
		 else if(input==5) {
		 }
		 else {
			 System.out.println("You have Choosen the Wrong Input");
		 }
		 
		 
	 }
	
}
