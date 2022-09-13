import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet();

		s.add(34);
		s.add(44);
		s.add(324);
		s.add(12);
		s.add(null);

		
		System.out.println(s);
		Set<Integer> s2=new HashSet();
		s2.add(34);
		s2.add(35);
		System.out.println(s2);
		
		s.addAll(s2);
		System.out.println("Adding both "+s);
        //s.removeAll(s2);
		//System.out.println("Removed :"+s);
		//s.retainAll(s2);
		//System.out.println("Retain All: "+s);
		
		System.out.println("Contains all:"+s.containsAll(s2));
	}

}
