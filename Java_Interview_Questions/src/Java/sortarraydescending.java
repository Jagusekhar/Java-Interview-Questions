package Java;
import java.util.*;
import java.util.Arrays;

public class sortarraydescending {
	public static void main(String[] args) {
		
		
		Integer [] arr = {99,89,51,93,44};
		
		  Arrays.sort(arr); // Sort ascending first
		  
		  for(int i=arr.length-1; i>=0; i--) // Reverse manually using a normal for loop
		  {
			  System.out.println(arr[i]);
		  }
	}

}
