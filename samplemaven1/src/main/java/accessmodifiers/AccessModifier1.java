package accessmodifiers;

public class AccessModifier1 {
	public void display()
	{
		System.out.println("Public");
	}
	private void display1() {
		System.out.println("Private");
		
	}
	protected void display2() {
		
		System.out.println("Protected");
		
	}
	void display3()
	{
		System.out.println("Default");
	}
	
	public static void main(String[] args) {
		AccessModifier1 obj = new AccessModifier1();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();

	}

}
