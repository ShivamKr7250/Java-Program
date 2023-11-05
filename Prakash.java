package program1.java;

public class Prakash implements Runnable {
	public void run() {
		System.out.println("My thread");
	}
	public static void main(String args[]) {
		Prakash p = new Prakash();
		Thread t1 = new Thread(p);
		t1.start();
	}

}
