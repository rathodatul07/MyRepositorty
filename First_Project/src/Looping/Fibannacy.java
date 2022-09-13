package Looping;

public class Fibannacy {

	public static void main(String[] args) {
		
	int num=9;
	int value1=1,value2=1,temp;
	for(int i=0;i<=num;i++)
	{
		System.out.println(value1);
		temp=value1;
		value1=value1+value2;
		value2=temp;
	}
	}

}
