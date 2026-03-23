package HashSets;

import java.util.HashSet;

public class AddSameInSet03 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Akash");
		set.add("Akash");
		set.add("Akash");
		set.add("Akash");
		System.out.println(set);
		set.remove("Akash");
		System.out.println(set);
		System.out.println(set.size());

	}

}
