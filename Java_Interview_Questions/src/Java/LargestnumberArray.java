package Java;

public class LargestnumberArray {
	
	public static void main(String[] args) {
	
		int[] array = {10, 20, 40, 90, 70, 40};  
		// Array containing 6 elements
		
		int largest = array[0];  
		// Assume first element (10) is the largest initially
		
		for(int i = 0; i < array.length; i++)  
		// Loop runs from index 0 to last index (5)
		{
			
			if(array[i] > largest)  
			// Compare current element with largest
			
			{
				largest = array[i];  
				// If current element is bigger, update largest
			}
		}
	
		System.out.println(largest);  
		// Final output: 90
	}
}
