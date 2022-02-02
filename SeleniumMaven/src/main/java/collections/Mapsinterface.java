package collections;

import java.util.HashMap;

public class Mapsinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap h = new HashMap();
h.put("A", 12345);
h.put(1, "How are you");
h.put("Hi", 'a');
System.out.println(h.get(1));
System.out.println(h.get("A"));
	}

}
