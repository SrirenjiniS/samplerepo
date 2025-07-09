package inheritance;

import accessmodifiers.AccessModifier1;

public class AccessModifier3 extends AccessModifier1  {
	
	

	public static void main(String[] args) {
		
		AccessModifier1 obj = new AccessModifier1();
		obj.display();
		AccessModifier3 obj1 = new AccessModifier3();
		obj1.display();
		obj1.display2();

	}

}
