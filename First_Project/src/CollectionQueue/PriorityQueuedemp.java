package CollectionQueue;

import java.util.PriorityQueue;

import CollectionSet.Item;


public class PriorityQueuedemp {
	public void CreatePriority()
	{
		
		PriorityQueue<Item> pq=new PriorityQueue<Item>();
		pq.add(new Item(2, "Book", 3000));
		pq.add(new Item(4, "Pen", 9000));
		pq.add(new Item(6, "NoteBook", 6000));
		//System.out.println();
		
		
	System.out.println();
		
	}

	public static void main(String[] args)
	{
		PriorityQueuedemp p=new PriorityQueuedemp();
p.CreatePriority();
	}

}
