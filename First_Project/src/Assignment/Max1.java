package Assignment;

public class Max1 {

	public static void main(String[] args)
	{
		int num=489;//48,4
	    int largest_digit=0;//7,8
	    while (num>0) //487>0=true,48>0=true,4>0
	    {
	    	int mod=num%10;//487%10=7,48%10=8,4%10=4
	    	if(largest_digit <mod)//0>7=true, 7<8=true 8<4=false
	    	{
	    		largest_digit=mod;//largest_digit = 7,8
	    	}
	    	num=num/10;//487/10=48,48/10=4,4/10=0
	    }
	    System.out.println("largest_digit are:"+largest_digit);
			
	}

}
