package HashMap;
import java.util.HashMap;
public class IterateInHashMap02 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Akash",1);
		map.put("sonu",2);
		map.put("Akshu",3);
		map.put("Maurya",4);
		map.put("Kush",5);
		
		System.out.println(map);
		
		for(String key : map.keySet()) { // ele - key
			int val = map.get(key);
			System.out.println(key+" "+val);
		}
		
		System.out.println();
		for(int val : map.values()) { 
			System.out.println(val);
		}
		
		System.out.println();
		for(Object pair : map.entrySet()) { 
			System.out.println(pair);
		}
		
	}

}
