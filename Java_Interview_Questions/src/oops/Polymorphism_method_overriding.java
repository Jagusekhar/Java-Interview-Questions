package oops;

class vehicle
{
void start()
{
System.out.println("Parent vehicle starts");	
}

}

class car extends vehicle
{
void start()
{
System.out.println("Child vehicle starts");	
}

}

public class Polymorphism_method_overriding {

	
	public static void main(String[] args) {
		
		
		vehicle v = new car();
		
		v.start();

				
		
		
		
	}
	
}
