package Java;

public class Replace_letters_with_spl_chars {
	
	public static void main(String[] args) {
		
	
	String Str = "jagu sekhar";
	
	//String res = Str.replace("a", "@").replace("e", "#"); // different symbol
	String res = Str.replaceAll("[a,e]", "@");
	
	System.out.println(res);
	
	
	}
	
	
	

}
