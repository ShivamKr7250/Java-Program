package program1.java;

interface Student_Details {
	 void name();
	 void rollno();
	 void section();
}

abstract class Student_Info implements Student_Details {
	
	public void name() {
		System.out.println("SHIVAM KUMAR");
	}
	public void rollno() {
		System.out.println("11212768");
	}
}

class Information extends Student_Info {
	
	public void section() {
		System.out.println("D");
	}
}

public class Pratical_7 {
	
	public static void main (String[] args) {
		Information obj = new Information();
		obj.name();
		obj.rollno();
		obj.section();
	}
}
