package basicOfStrings;

public class lowerUpperCase06 {

	public static void main(String[] args) {
	String s = "Akash sonu is a handsome gie";
	// System.out.println(s.toLowerCase());
	// s.toLowerCase(); -> nothing will happen
	s = s.toLowerCase();
	System.out.println(s);
	System.out.println(s.toUpperCase());
	
	String a = "abc";
	String b = "xyz";
	// a.concat(b); -> nothing will happen
	System.out.println(a.concat(b));
	System.out.println(a);
	a = a.concat(b);
	System.out.println(a);
	
	}
}
