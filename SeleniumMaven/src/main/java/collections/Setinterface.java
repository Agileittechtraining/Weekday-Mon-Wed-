package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Setinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet hs = new LinkedHashSet();
hs.add(123);
hs.add(123);
hs.add("ABCD");
hs.add("ABCD");
hs.add(2345);
hs.add(2345);
Iterator i = hs.iterator(); //get the data
System.out.println(i.next());
System.out.println(i.next());
System.out.println(i.next());
System.out.println(hs);
	}

}
