package program1.java;
import java.lang.*;
class Ritik1 extends Thread {
	
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}
 }
 class Prakash1 extends Ritik1{
		public void run() {
			for(int j=0;j<=10;j++) {
				System.out.println(j);
			}
		}
	}
	
public class method1 extends Prakash1{
	public static void main(String[] args) {
		Prakash1 obj2=new Prakash1();
		obj2.start();
		
	
		
		
		
	}
	
	}


