package Java;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	
	String str1 = "silent";
	String str2 = "listen";
	
	char[] a = str1.toCharArray();
	char[] b= str2.toCharArray();
	
	
	Arrays.sort(a);
	Arrays.sort(b);

	if(Arrays.equals(a, b))
	{
		
		System.out.println("Anagram");
		
	} else
	{
		System.out.println("Not anagram");
	}
}
	
}
