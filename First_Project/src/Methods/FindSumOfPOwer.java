package Methods;

public class FindSumOfPOwer
{
public int countDigit(int x)
{
	int cnt=0;
	while(x>0)
	{
		cnt++;
		x=x/10;
	}
	return cnt;
}
public int findPower(int base, int power)
{
	int multi=1;
	while(power>1)
	{
		multi=multi*base;
		power--;
	}
	return multi;
}
public int calPowerSum(int number)
{
	int sum=0;
	int digit=countDigit(number);
	while(number=>0)
	{
		int rem=number%10;
		sum=findPower(rem,digit);
		number=number/10;
		digit--;
	}
}
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSumOfPOwer f=new FindSumOfPOwer();
		f.calPowerSum(345);
	}

}
