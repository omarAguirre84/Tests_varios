package map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Omar", 31012550);
		map.put("Armando", 31012551);
		map.put("Evelina", 31012552);
		System.out.println(map.size());
		System.out.println(map.containsKey("Eve"));
		
		
	}

}
