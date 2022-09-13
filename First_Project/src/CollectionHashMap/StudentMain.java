package CollectionHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StudentMain {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> mp6=new LinkedHashMap<Integer,String>();
		mp6.put(12,"AAA");
		mp6.put(2, "BBB");
		mp6.put(3, "CCC");
		System.out.println(mp6);
    HashMap<Student,String> map=new HashMap<>();
    HashMap<Integer,String> map1=new HashMap<>();
    Student o =new Student(101,"Ajay",90);
    Student o1=new Student(101,"Ajay",90);
    System.out.println(o.hashCode());
    System.out.println(o1.hashCode());
    
    
   
    map.put(o, "First");
    map.put(o1,"Second");
    System.out.println(map);
    
    map1.put(23, "Kavita");
    map1.put(45, "Kishor");
    map1.put(89,"kitanjali");
    map1.put(null , "Rakesh"); 
    map1.put(100, null);
    System.out.println(map1);
	}
	
	

}
