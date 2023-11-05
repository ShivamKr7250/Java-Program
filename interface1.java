package program1.java;

interface A{
	public  void rk() {
		System.out.print("A");
	}
}
interface B{
	public void sh() {
		System.out.println("B");
	}
}

class interface1 implements A,B {

	public static void main(String[] args) {
		interface1 obj=new interface1();
		obj.rk();
		obj.sh();

	}

}
