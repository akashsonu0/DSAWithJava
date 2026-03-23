package HashSets;

import java.util.HashSet;

public class basicset01 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		// Insert : TC = O(1)
		set.add(20);
		set.add(100);
		set.add(10);
		set.add(-8);
		set.add(200);
		System.out.println("Size is : "+set.size());
		// Search - true/false : TC = O(1)
		System.out.println(set);
		System.out.println(set.contains(100));
		System.out.println(set.contains(50));
		set.add(50);
		System.out.println("Size is : "+set.size());
		System.out.println(set.contains(50));
		set.remove(200);
		System.out.println(set);
		set.remove(90);
		System.out.println("Size is : "+set.size());
		
		Object[] arr = set.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
