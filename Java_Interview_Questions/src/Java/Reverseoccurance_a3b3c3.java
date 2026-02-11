package Java;

public class Reverseoccurance_a3b3c3 {
	
	public static void main(String[] args) {
		
		String str = "a3b3c3d5";
		String rev = "";
		
		for(int i=0; i<str.length(); i+=2)
		{
			for(int j=0; j<str.charAt(i+1)-'0'; j++)
			{
				rev=rev+str.charAt(i);
			}
			
		}		
		System.out.println(rev);
	}

}
