package Array;

public class CountDuplicate {

	public static void main(String[] args) {
	
		int a[]= {3,5,6,4,5,5,3,8,4,1};
		int cnt=1;
		
		
		for( int i=0;i<=a.length-1;i++)
		{
			if(a[i]=='0')//1
				continue;//2
			
		
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{					
					cnt++;
				
					a[j]='0';//3
				}
			}
			System.out.println("occurance of "+a[i]+"="+cnt);
			
		}		
		
	}

}
