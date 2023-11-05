package program1.java;

class overriding {
    public void show(){
          System.out.println("Student details.");
    }
}

 public class details extends overriding {
    public void show(){
          System.out.println("College Student details.");
    }
    public static void main(String args[]){  
    details obj = new details();

     obj.show();
    }
}
