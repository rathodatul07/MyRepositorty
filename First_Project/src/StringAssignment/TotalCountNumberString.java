package StringAssignment;

public class TotalCountNumberString {

	public static void main(String[] args) 
	{
	   String s="AtulRathod";
	   char c[]=s.toCharArray();
	   int count=0;
	   for(int i=0;i<=c.length-1;i++)
	   {
		  if(c[i]>0)
		  {
			  count++;
		  }
	   }
	   System.out.println("Total count of given String Are:"+count);
	}

}
