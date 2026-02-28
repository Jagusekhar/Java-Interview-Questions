package Java;

public class Duplicate {

	
	
	public static void main(String[] args) {
		
		
		String [] arr = {"Java","is","great","language","Java","great"};
		//int arr[] = {1, 2, 3, 2, 4, 1, 5};
		
		for (int i=0; i<arr.length; i++)
		{
			
			for (int j=i+1; j<arr.length; j++)
				
			{
				if(arr[i].equals(arr[j]))
				{
					
					System.out.println(arr[i]);
				}
				
			}
			
		}
		
	}
}
