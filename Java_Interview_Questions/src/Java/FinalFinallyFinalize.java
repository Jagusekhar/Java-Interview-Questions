package Java;

public class FinalFinallyFinalize {
	
	

	public static void main(String[] args) {

		//		//final
		//
		//		final int x=10;
		//
		//		System.out.println(x);


		//Finally


		try

		{

			int a=10/0;

		} catch (Exception e)

		{

			System.out.println("Error occured");

		}

		finally {
			System.out.println("finally block executed");
		}

	}
}



