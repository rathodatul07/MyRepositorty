package CollectionQueue;

import java.util.LinkedList;

public class LinkedListAsQueue 
{
LinkedList<String> q=new LinkedList<>();


	public static void main(String[] args) {
		LinkedListAsQueue o=new LinkedListAsQueue();
		System.err.println(o.q);
		o.q.add("ASSS");
		o.q.add("BBBB");
		o.q.add("cccc");
		System.out.println("Queue is : "+o.q);
		o.q.removeFirst();
		System.out.println(o.q);
		o.q.removeLast();
		System.out.println(o.q);
		
	}

}

