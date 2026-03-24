package HashMap;

import java.util.HashMap;

public class BasicMethodsOfHashMap01 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Akash",1);
		map.put("sonu",2);
		map.put("Akshu",3);
		map.put("Maurya",4);
		map.put("Kush",5);
		System.out.println(map);
		map.put("luv",6);
		System.out.println(map);
		map.put("priya",1);
		System.out.println(map);
		System.out.println(map.containsValue(1));
		System.out.println(map.size());
		map.remove("priya");
		System.out.println(map.size());
		map.remove("prit");
		System.out.println(map.size());
		map.remove("priya");
		System.out.println(map.get("Akash"));
		
	}
}
