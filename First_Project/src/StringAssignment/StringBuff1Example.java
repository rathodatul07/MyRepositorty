package StringAssignment;

public class StringBuff1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=22;
		double  b=21;
		a=(int) b;
		System.out.println(a);
		String s="Atul";
		StringBuffer s1=new StringBuffer("Hello");
		s1.append("world");
		System.out.println(s1);
		StringBuilder s2=new StringBuilder(s);
		System.out.println(s2.append(s));
	}
}
