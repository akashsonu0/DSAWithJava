package BasicsOfArrays;

import java.util.ArrayList;

public class ArrayListAdd14 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list+" "+list.size());
		list.add(90);
		System.out.println(list+" "+list.size());
		list.add(100);
		System.out.println(list+" "+list.size());
		list.remove(1);
		System.out.println(list+" "+list.size());

	}

}
