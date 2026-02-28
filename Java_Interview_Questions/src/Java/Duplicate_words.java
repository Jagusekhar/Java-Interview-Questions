package Java;

public class Duplicate_words {
	
	
	public static void main(String[] args) {
		
		String str = "QA Testing QA Testing Automation";
		
		String [] words = str.split(" ");
		
		for(int i=0; i<words.length; i++)
		{
			for (int j=i+1; j<words.length; j++)
			{
				if(words[i].equals(words[j]))
				{
					System.out.println(words[i]);
				}
				
			}
			
		}
		
		
	}

}
