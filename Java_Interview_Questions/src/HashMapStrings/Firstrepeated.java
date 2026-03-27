package HashMapStrings;
import java.util.*;
public class Firstrepeated {

	public static void main(String[] args) {
		
		String str = "Happy";
		str= str.toLowerCase();
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for (int i =0; i<str.length(); i++)
		{
		 char ch = str.charAt(i);
		 if(ch == ' ') continue;
		 
		 map.put(ch, map.getOrDefault(ch, 0 )+1);
		}
		
		//Duplicate
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			
			if(entry.getValue()>1)
			{
				
				System.out.println(entry.getKey());
				break;
			}
		}
	}
	
}
