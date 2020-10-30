package scenariopgms;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(40);
		
		System.out.println("head:"+que.element());
		System.out.println("head:"+que.peek());
		
		System.out.println("Iterating elements");
		
		Iterator it1 = que.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.hasNext());
		}
		
		que.remove();
		que.poll();
		
		System.out.println(" After Iterating elements");
		
		Iterator<Integer> it2 =que.iterator();
		
		while(it2.hasNext())
		{
			System.out.println(it2.hasNext());
		}
		
	}

}
