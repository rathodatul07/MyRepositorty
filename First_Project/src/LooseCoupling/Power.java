package LooseCoupling;

import java.util.Scanner;

public class Power 
{
public int powerA(int base,int power)
{
	if(power==0)
	{
		return 1;
	}
	else
	{
		return (base*powerA(base,power-1));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power p=new Power();
Scanner sc=new Scanner(System.in);

System.out.println("Enter Base");
int base=sc.nextInt();
System.out.println("enter power");
int power=sc.nextInt();



System.out.println(p.powerA(base, power));
}

}
