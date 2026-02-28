package Java;
import java.util.*;

public class Arraylist_removeduplicates {
	
	public static void main(String[] args) {
		 //public static void main(String[] args) {
		        List<String> list = new ArrayList<>(Arrays.asList("QA", "Testing", "QA", "Automation"));
		        Set<String> set = new LinkedHashSet<>(list); // preserves order
		        list.clear();
		        list.addAll(set);
		        System.out.println(list);
		
		
		
	}

}
