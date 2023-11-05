package program1.java;

public class Ritik implements Runnable {
	public void run() {
		System.out.println("My name is Ritik Raj");
	}	

	public static void main(String[] args) {
		Ritik obj=new Ritik();
		Thread t=new Thread(obj);
		t.start();
		

	}

}
