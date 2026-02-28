package Java;

import java.util.HashSet;
import java.util.LinkedList;

public class ListandSet {
	
	public static void main(String[] args) {
		
		LinkedList name = new LinkedList();
		
		name.add("Jagu");
		name.add("sekhar");
		name.add("Jagu");
		name.add("hari");
		
		System.out.println(name); // Duplicate allowed
		
		System.out.println(name.size()); 
		System.out.println(name.get(1)); // Apple (index-based access)
		
		System.out.println("====================");
		HashSet people = new HashSet();
		
		people.add("Jagu");
		people.add("sekhar");
		people.add("Jagu"); // Duplicates not allowed
		people.add("hari");
		
		System.out.println(people);
		

	}

}
