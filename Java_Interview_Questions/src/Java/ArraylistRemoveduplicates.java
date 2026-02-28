package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArraylistRemoveduplicates {
	
	
public static void main(String[] args) {
	
	
	//ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,1,3,2,1,4,1,2));
	//ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","A","C","B"));
	ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Ball","Apple","Cat","Ball"));
	
	LinkedHashSet<String> Hash = new LinkedHashSet<>(list);
	
	System.out.println(Hash);
	
	
	
	
}

}
