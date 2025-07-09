package superkeyword;

public class Supervariablechild extends Supervariableparent{
	
	int n =5;
	public void display()
	{
		System.out.println(n);
		System.out.println(super.n);
	}

	public static void main(String[] args) {
		
		
		Supervariablechild sc = new Supervariablechild();
        sc.display();
	}

}
