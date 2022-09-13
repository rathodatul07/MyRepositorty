
public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int num=0;
		int maxChech=100;
		boolean isPrime=true;
		
		String PrimeNumberFound="";
		for(i=num;i<=maxChech;i++)
		{
			isPrime=CheckPrime(i);
			if(isPrime)
			{
				System.out.println(PrimeNumberFound);
			}
			public static boolean CheckPrime(int numberToCheck)
			{
				int reminder;
				for( i=2;i<=numberToCheck/2;i++)
				{
					reminder=numberToCheck%i;
					if(reminder==0)
					{
						return false;
					}
				}
				
				return true;
			}
		}

	}

	

}
