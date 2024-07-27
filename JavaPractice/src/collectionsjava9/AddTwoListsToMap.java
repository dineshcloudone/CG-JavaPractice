package collectionsjava9;

import java.util.*;

public class AddTwoListsToMap {

	void normalApproach() {

		List<String> keys = new ArrayList<String>();
		List<String> values = new ArrayList<String>();
		HashMap<String, String> hm = new HashMap<String, String>();

		keys.add("key1");
		keys.add("key2");
		keys.add("key3");

		values.add("value1");
		values.add("value2");
		values.add("value3");

		for (int i = 0; i < keys.size(); i++) {
			hm.put(keys.get(i), values.get(i));
		}

		hm.forEach((x, y) -> System.out.println("key : " + x + ", value : " + y));
	}

	void usingOfJava9() {
		// factory method List.of
		List<String> keys = List.of("key1", "key2");

		// factory method List.of
		List<String> values = List.of("valu1", "value2");
		
		Map<String,String> map=new HashMap<>(Map.ofEntries(Map.entry(null, null))
	}

	public static void main(String[] args) {

	}
}
