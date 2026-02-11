package Java;

public class Constructorsample {
	
	int i;
	String name;
	
	Constructorsample (int id, String person)
	{
		
		i= id;
		name= person;
	}
	
	void display()
	{
		
		System.out.println(name + i);
	}
	
	public static void main(String[] args) {
		
		Constructorsample cs = new Constructorsample(100, "sekhar");
		
		cs.display();
		
	}
	


}
