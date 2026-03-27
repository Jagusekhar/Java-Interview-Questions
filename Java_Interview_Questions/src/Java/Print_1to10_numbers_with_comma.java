package Java;

import java.util.Iterator;

public class Print_1to10_numbers_with_comma {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			
			System.out.print(i);
			if(i<10)
			{
				System.out.print(",");
			}
			
		}
		
	}

}
