package Java;

public class Forloop {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		int [] arr = {10,20,30};
		
		/*
		 * for(int i=0; i<arr.length; i++) 
		 * {
		 *  int num = arr[i]; 
		 *  System.out.println(num);
		 * }
		 */
		
		for(int num : arr)
		{
			System.out.println(num);
			
		}
		
		
		
		
	}
}
