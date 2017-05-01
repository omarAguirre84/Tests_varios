package map;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Omar", 33000111);
		map.put("Armando", 33000222);
		map.put("Evelina", 33000333);
    	map.put("Fatima", 33000444);
		System.out.println(map.size());
		System.out.println("Eve? "+map.containsKey("Eve"));
		System.out.println("Evelina? "+map.containsKey("Evelina"));
		System.out.println("33000333? "+map.containsValue(33000333));
	}
}
