package HashMap;
import java.util.TreeMap;
public class TreeMap03 {
	public static void main(String[] args) {
		TreeMap<String,Integer> map = new TreeMap<>();
		map.put("Akash",1);
		map.put("sonu",2);
		map.put("Akshu",3);
		map.put("Maurya",4);
		map.put("Kush",5);
		for(String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
			
		}
	}
}



