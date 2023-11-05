package program1.java;

public class Threadritik extends Thread{
	public void run() {
		System.out.print("My name is ritik raj");
	}

	public static void main(String[] args) {
		Threadritik t=new Threadritik();
		t.start();

	}

}
