package basicOfStrings;

public class interning11 {

	public static void main(String[] args) {
		String s = "Akash";
		String q = "Akash";
		String a = new String("Akash");
		// Akash -> Hkash
		// s.charAt(0) = 'H'; Error
		System.out.println(s);
	}

}
