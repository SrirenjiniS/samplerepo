package inheritance;

public class HirarchialChild1 extends Hirarchialparent  {
     public void display1()
     {
     System.out.println("Child class1");
     
     }
	public static void main(String[] args) {
	
		HirarchialChild1 obj = new  HirarchialChild1();
		obj.display();
		obj.display1();

	}

}
