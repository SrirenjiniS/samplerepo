package sampleinterface;

public class Child1 implements Parent1,Parent2 {
	
	public void display()
	{
		System.out.println("This is a child method");
	}

	public void print()
	{
	System.out.println("This is print method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1  obj =new Child1();
	    obj.display();
		obj.print();
		obj.show();
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This is show method");
	}

}
