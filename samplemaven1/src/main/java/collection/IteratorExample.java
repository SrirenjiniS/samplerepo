package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		
		Set<String> a= new  HashSet <String>();
		a.add("apple");
		a.add("banana");
		a.add("orange");
		
		System.out.println(a);
		
		Iterator i = a.iterator();//i used to iterate variable here iterating a values
		
		while(i.hasNext())  //verifies whetehr the element is there or not
		{
			
			System.out.println(i.next());
			
		}
		
		i.remove(); //remove the next element
		System.out.println(a);
		
		
		
		
		
	}

}
