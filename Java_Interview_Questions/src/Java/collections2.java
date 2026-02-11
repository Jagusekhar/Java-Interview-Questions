package Java;

import java.util.ArrayList;
import java.util.HashSet;

public class collections2 {
	
	public static void main(String[] args) {
		
		//List
		//List allows duplicates
		//Maintains insertion order
		//Index-based access
		
		ArrayList<String> shoppinglist = new ArrayList<String>();
		
		shoppinglist.add("Milk");
		shoppinglist.add("Bread");
		shoppinglist.add("Milk");
		
		System.out.println(shoppinglist.get(0));
		
		System.out.println(shoppinglist);
		
		//Set
		//No duplicates
		//Order not guaranteed (HashSet)
		
		HashSet<Integer> Employeeids = new HashSet<Integer>();
		
		Employeeids.add(101);
		Employeeids.add(102);
		Employeeids.add(103);
		Employeeids.add(104);
		Employeeids.add(103);
		System.out.println(Employeeids);
		
		//Queue
		
		
		
	}

}
