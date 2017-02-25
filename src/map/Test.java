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
		
		for (Map.Entry<String, Integer> mapa : map.entrySet()) {
			System.out.println(mapa.getKey() +"="+ mapa.getValue());
		}
		
		
		map.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));

		
	}

}
