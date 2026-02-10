package StringBuilder;

public class append05 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Abc");
		System.out.println(sb);
		sb.append(34);
		System.out.println(sb);
		sb.append("*");
		System.out.println(sb);
		char[] ch = {'a','k','a','s','h'};
		sb.append(ch);
		System.out.println(sb);
//		int[] arr = {2,3};  // does not work address is appended
//		sb.append(arr);
//		System.out.println(sb);
		
		StringBuilder t = new StringBuilder("pqr");
		sb.append(t);
		System.out.println(sb);

	}

}
