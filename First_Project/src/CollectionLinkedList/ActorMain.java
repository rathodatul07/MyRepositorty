package CollectionLinkedList;

import java.util.ArrayList;
import java.util.TreeMap;

public class ActorMain 
{
	ArrayList<Movie> al=new ArrayList<Movie>();
	ActorMain()
	{
		al.add(new Movie("Acharya","Arjun",7687777,3,new ActorAss(201, "Madhavan")));
		al.add(new Movie("Aryan","Brahma",687777,4,new ActorAss(202, "RHeman")));
		al.add(new Movie("Patak","BRajnya",87777,1,new ActorAss(203, "Shetty")));
		System.out.println(al);
		
	}
	public void CreateMap()
	{
		TreeMap<String,String> tm=new TreeMap<>();
	}
	public static void main(String[] args) 
	{
		ActorMain a=new ActorMain();
		
		 
	}

}
