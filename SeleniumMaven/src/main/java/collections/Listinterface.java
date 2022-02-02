package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList al = new LinkedList();
al.add(123);
al.add(23456);
al.add("Hello");
al.add("Hello");
al.add("Hi");
al.add("Hi");
al.remove(1);
al.removeAll(al);
System.out.println(al);
System.out.println(al.size());
for(int i=0;i<al.size();i++) {
	System.out.println(al.get(i));
}
	}

}
