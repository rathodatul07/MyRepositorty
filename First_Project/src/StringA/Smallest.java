/package StringA;

public class Smallest {
	public void small(int num)
	{
		int mod=num%10;
		while(num>0)
		{
			if(num%10<mod)

			{
				mod=num%10;
			}
			num=num/10;
		}
		System.out.println(mod);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=281;  
		Smallest s=new Smallest();
		s.small(num);

	}
}