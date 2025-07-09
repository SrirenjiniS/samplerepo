package polymorphism;

public class Polychild extends Polyparent {

	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		Polychild pc = new Polychild();
		pc.add(2, 1);
		// TODO Auto-generated method stub

	}

}
