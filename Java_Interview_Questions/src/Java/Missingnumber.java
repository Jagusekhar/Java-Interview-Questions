package Java;

public class Missingnumber {
	
	public static void main(String[] args) {
		
	int []arr= {1,2,3,5};
	int n = arr.length+1;
	
	int expectedsum = n*(n+1)/2;
	
	int actualsum =0;
	
	for(int i=0; i<arr.length; i++)
	{
		actualsum+=arr[i];
		
	}
		int missednum = expectedsum-actualsum;
		System.out.println(missednum);
	}
	
}
