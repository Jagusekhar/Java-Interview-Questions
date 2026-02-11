package Java;

public class trycatch {

	public static void main(String[] args) {



		try {

			int result = 10/0;

			System.out.println(result);
		} 

		catch (ArithmeticException e)
		{

			System.out.println("Exception caught: " + e);

		}

		finally
		{
			System.out.println("finally");
		}

	}
	
}
