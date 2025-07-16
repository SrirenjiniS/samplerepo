package aggregation;

public class Child {
	
	String city;
	String state;
	Parent ref;
	
	Child(String city,String state,Parent ref)
	{
		this.city=city;
		this.state=state;
		this.ref =ref;
	}
	
	public void display()
	{
		System.out.println(ref.name+" "+ ref.rollno+" "+ ref.address);
		System.out.println(city+""+ state);
	}

	public static void main(String args[])
	{
	Parent obj1=new Parent("Renjini",20,"abcd");
	Child obj=new Child("tvm","Kerala",obj1);
	obj.display();
}
}
