package Java;

public class LargestnumberArray {
	
	public static void main(String[] args) {
	
		int[] array = {10, 20, 40, 90, 70, 40};
	
		int largest = array[0];
		
		for(int i=0; i<array.length; i++)
		{
			
			if(array[i]>largest)
				
			{
				
				largest = array[i];
			}
		}
	
		System.out.println(largest);
}}
