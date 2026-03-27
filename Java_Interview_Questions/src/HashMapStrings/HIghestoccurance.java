package HashMapStrings;
import java.util.*;

public class HIghestoccurance {

	public static void main(String[] args) {
		
	String str = "ShreedhaN SriRam";
	str= str.toLowerCase();
	
	HashMap<Character, Integer> map = new LinkedHashMap<>();
	
	for (int i =0; i<str.length(); i++)
	{
	 char ch = str.charAt(i);
	 if(ch == ' ') continue;
	 map.put(ch, map.getOrDefault(ch,0)+1);
	}
		int max =0;
		char result = ' ';
	for(Map.Entry<Character, Integer> entry:map.entrySet())
	{
		if(entry.getValue()>max)
		{
			max=entry.getValue();
			result = entry.getKey();
		}
	}
		System.out.println(result);
	}
}
