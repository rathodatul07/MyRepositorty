package StringA;

public class SecondOccurance {
//program not done
	public static void main(String[] args) 
	{
	
		String str="Welcome to India";
		int occure=0;
		char ch='W';
		int n=2;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				occure+=i;
			}
			}
		System.out.println(occure);
	}

}
