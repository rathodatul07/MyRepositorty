import java.util.Scanner;

public class ConvertBinary {
	public void convertB(int num)
	{
		int binary=0;
		int binary1=0;
		while(num>0)
		{
			binary=num%2;
			System.out.print(binary+" ");
			num=num/2;
			binary1+=binary;
		}
	}
}


