package program1.java;

public  class Test extends Interface {
	void name() {
		System.out.println("SHIVAM KUMAR");
	}
	void rollno() {
		System.out.println("11212768");
	}
	void section() {
		System.out.println("D");
	}
	
	public static void main (String[] args) {
		Test nam = new Test();
		nam.name();
		nam.rollno();
		nam.section();
	}

}
