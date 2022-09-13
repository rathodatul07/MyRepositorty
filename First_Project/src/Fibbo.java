
public class Fibbo {

	public static void main(String[] args) {
		
		
		int val1=0;
		int val2=1,temp;
		for(int i=0;i<=10;i++)
		{
			System.out.println(val1);
			temp=val1;
			val1=val1+val2;
			val2=temp;
		}

	}

}
