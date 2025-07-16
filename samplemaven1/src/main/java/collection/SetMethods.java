package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		
		
		Set<String> a= new  HashSet <String>();
		a.add("apple");
		a.add("banana");
		a.add("orange");
		
		System.out.println(a);
		
		Set <String> b = new HashSet <String>();
		b.add("Watermelon");
		b.add("Pineapple");
		
		System.out.println(b);
		
		a.addAll(b);
		System.out.println("The set is" +a);
		System.out.println(a.containsAll(b));
		System.out.println(a.containsAll(a));
		System.out.println(a.isEmpty());
		
		System.out.println(a.remove("Watermelon"));
		System.out.println(a.size());
		System.out.println("Remove all elements"+a.removeAll(b));
		a.clear();
		System.out.println(a);
	}

}
