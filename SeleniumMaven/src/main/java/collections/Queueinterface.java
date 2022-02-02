package collections;

import java.util.PriorityQueue;

public class Queueinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue pq = new PriorityQueue();
pq.add(1234);
pq.add(345);
pq.add(789);
System.out.println(pq);
System.out.println(pq.peek());  //what is the first element
pq.poll(); // addresses the first element and removes after request is solved
System.out.println(pq);
pq.poll();
System.out.println(pq);
	}

}
