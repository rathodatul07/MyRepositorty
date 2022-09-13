package CollectionLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo {
	public void PrepareLinked(LinkedList<Integer> l) {
		Iterator<Integer> itr = l.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(null);
		l.add(69);
		l.add(50);
		l.add(null);
		l.add(20);
		System.out.println(l);
		LinkedDemo ld = new LinkedDemo();
		ld.PrepareLinked(l);
	}

}
