package oops;

class calculater{

	int add(int a, int b)
	{
		return a+b;
	}

	int add(int a, int b, int c)
	{

		return a+b+c;
	}

}


public class Polymorphism_method_overloading {
	public static void main(String[] args) {

		calculater cal = new calculater();

		System.out.println(cal.add(2, 3));
		System.out.println(cal.add(2, 3, 4));
	}




}
