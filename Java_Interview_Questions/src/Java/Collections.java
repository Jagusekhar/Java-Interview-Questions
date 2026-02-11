package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Collections {


	public static void main(String[] args) {

		//LIST

		//Array list

		ArrayList<String> employee = new ArrayList<String>();

		employee.add("Jagu");
		employee.add("hari");
		employee.add("chandra");
		employee.add("Sekhar");
		employee.add("hari");
		System.out.println("List:" +employee);


		// Linked List

		LinkedList<String> names = new LinkedList<String>();

		names.add("Jagu");
		names.add("hari");
		names.add("chandra");
		names.add("sekhar");
		names.add("hari");
		
		names.addFirst("Hello");
		
		names.remove("chandra");	
		
		names.removeLast();
		
		names.removeFirst();
		
		System.out.println(names);
		
		
		//SET
		//Hashset
		
		HashSet<String> person = new HashSet<String>();
		person.add("Hi");
		person.add("Hello");
		person.add("Hi");
		person.add("Hello");
		System.out.println("Hashset: "+person);
		
		
		//QUEUE
		
		Queue<String> sort = new LinkedList<String>();
		
		sort.add("File1");
		sort.add("File2");
		sort.add("File3");
		
		System.out.println(sort.poll());
		System.out.println(sort);
		
		//MAP
		
		//HashMap
		
		HashMap<Integer, String> Map = new HashMap<>();
		
		Map.put(101, "Jagu");
		Map.put(102, "Sekhar");
		System.out.println(Map.get(102));
		
		
		
		
		
		

	}
}
