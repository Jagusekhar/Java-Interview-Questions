package Java;

public class Palindrome121 {

	public static void main(String[] args) {

		int num = 123;
		int reverse = 0;
		int n=num;
		while(n>0) {
			int digit = n%10;

			reverse=reverse*10+digit;

			n=n/10;
		}
		if(num==reverse)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}


	}

}
