package abstraction;

public class AbractChild extends AbstractParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbractChild abs = new AbractChild();
		abs.display();
		abs.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract child");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("Abstract Parent");
		
	}

}
