package Java;

public class a1bc2de3ef27xyz67 {

	public static void main(String[] args) {


		String str = "1abc2de3ef27xyz67";
		int sum =0;
		int num =0;
		

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{

				num = num*10+(ch-'0');

			}
			else
			{

				sum=sum+num;
				num=0;
			}
		}
		sum=sum+num;
		System.out.println(sum);
	}

}
