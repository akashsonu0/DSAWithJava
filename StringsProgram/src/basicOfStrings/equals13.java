package basicOfStrings;

public class equals13 {

	public static void main(String[] args) {
		String s = "abcxyz";
		String a = "abc";
		String b = new String(s);
		String c = "abc";
		c = c + "xyz";
		System.out.println(s==b);
		System.out.println(s.equals(c));

	}

}
