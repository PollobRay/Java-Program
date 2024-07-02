import java.util.*;

class Test
{
	public static void main(String ars[])
	{

		PriorityQueue pq=new PriorityQueue();
		pq.offer("A");
		pq.offer("C");
		pq.offer("D");
		pq.offer("B");

		System.out.println(pq);
		System.out.println(pq.poll()); // retrive & delete
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}