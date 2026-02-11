package Java;

public class ImmutableAndmutable {
	
	public static void main(String[] args) {
		//immutable
		String s = "Jagu";
		s = "hari";
		
		System.out.println(s);
		
		//mutable
		String p = "sekhar";
		
		p.concat("Hello");
		
		System.out.println(p.concat("Hello"));

	}}

