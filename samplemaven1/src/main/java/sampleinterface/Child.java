package sampleinterface;

public class Child implements InterfaceParent {
	
	public void display()
	{
		System.out.println("This is a child method");
	}

	public void print()
	{
	System.out.println("This is print method");
	}

	public static void main(String[] args) {
		
		InterfaceParent obj =new Child();
	    obj.display();
		obj.print();
		
	}

}

