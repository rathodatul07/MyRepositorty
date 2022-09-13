package CollectionHashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class OccuranceOfWord {
	public void showOccurance()
	{
		HashMap<String, Integer> mp=new HashMap<>();
mp.put(null, 1);
mp.put("india", 1);
mp.put("is", 1);
mp.put("my", 1);
mp.put("country", 1); 
System.out.println(mp);
		String str="india  my country";
	String word[]=str.split(" ");
	for(int i=0;i<word.length;i++)
	{
		//System.out.println(word[i]);
	}
	
	for(String words: word)
	{
		Integer integer=mp.get(words);
		if(integer==null)
		{
			mp.put(words, 1);
		}
		else
		{
			mp.put(words,integer+1);
		}
		
	}
	Set set=mp.entrySet();
	Iterator itr=set.iterator();
	
	while(itr.hasNext())
	{
		Map.Entry entry=(Map.Entry)itr.next();
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	}

	public static void main(String[] args)
	{
		OccuranceOfWord o=new OccuranceOfWord();
		o.showOccurance();

	}

}
