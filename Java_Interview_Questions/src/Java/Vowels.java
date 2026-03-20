package Java;

public class Vowels {

	public static void main(String[] args) {

		String str = "Jagu HARI chandra SekhAr";
		str = str.toLowerCase();
		int a = 0, e=0, i=0, o=0, u=0; 

		for (int j=0; j<str.length(); j++)
		{

			char ch = str.charAt(j);

			if (ch=='a')
				a++;
			else
				if (ch=='e') 
					e++;
				else if (ch=='i') 
					i++;
				else if (ch=='o') 
					o++;
				else if (ch=='u') 
					u++;

		}

		if (a>0) System.out.println(a +" :a");
		if (e>0) System.out.println(e +" :e");
		if (i>0) System.out.println(i +" :i");
		if (o>0) System.out.println(o +" :o");
		if (u>0) System.out.println(u +" :u");
	}	

}
