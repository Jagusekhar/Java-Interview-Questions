package Java;

public class Ascending_and_Descending {

	public static void main(String[] args) {

		int[] arr = {2, 5, 33, 8, 4};

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{

				if (arr[i]>arr[j])
				{

					arr[i] = arr[i]+arr[j];
					arr[j]= arr[i]-arr[j];
					arr[i]= arr[i]-arr[j];
					
				}
			}
		}

		for(int num: arr)
		{
			System.out.println(num);
		}
		
	}

}
