package Hashset;
import java.util.*;

public class Duplicatestrings {
	public static void main(String[] args) {
		String str = "happy";
		HashSet<Character> set = new LinkedHashSet<>();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			set.add(ch);
		}
		System.out.println(set);
	}

}
