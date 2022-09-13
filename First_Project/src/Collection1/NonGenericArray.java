package Collection1;

import java.util.ArrayList;

public class NonGenericArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> a =new ArrayList<>();
//ArrayList<Integer> l =new ArrayList<>();

a.add(12);
a.add(56);
a.add(27);
a.add(34);
a.add(12);
System.out.println(a);
ArrayList<Integer> l =new ArrayList<>();
l.add(12);
l.add(56);
l.add(27);
l.add(34);
l.add(12);

System.out.println(a.retainAll(l));
System.out.println(a.remove(2));
System.out.println(a);
System.out.println(a.size());
l.add(1, 30);
System.out.println(l);

	}

}
