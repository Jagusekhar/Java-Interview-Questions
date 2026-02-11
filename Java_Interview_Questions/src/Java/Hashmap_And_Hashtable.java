package Java;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashmap_And_Hashtable {
	
	
	
	public static void main(String[] args) {
		
		//HashMap
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(3, "Jagu");
		map.put(2, "Sekhar");
		map.put(null, "Hari");
		map.put(4, null);
		
		System.out.println(map);
		
	
	//HashTable
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(1, "Hi");
		//table.put(null, "Hello");
		table.put(2, "World");
		//table.put(3, null);
		
		System.out.println(table);
	}

	
	
	
	
}
