package HashSets;
import java.util.HashSet;
public class setIterate02 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(20);
		set.add(100);
		set.add(10);
		set.add(-8);
		set.add(200);
		for(int ele : set) {
			System.out.print(ele+" ");
		}
		System.out.println();
//		set.clear();
//		System.out.println(set);
		set.add(13);
		System.out.println(set);
		set.add(20);
		System.out.println(set);
	}
}
