package Java;

public class Fibonacciloop {
	
	public static void main(String[] args) {
		
	
		int n = 5;
		int first = 0;
		int second = 1;
		
		for(int i=0; i<n; i++)
		{
			int next = first+second;
			first = second;
			second = next;
			System.out.println(next);
		}
		
		
		
	}

}
