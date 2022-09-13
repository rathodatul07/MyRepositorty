import java.util.Scanner;

public class ArrayAss1Main
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("please enter size of array");
int size=sc.nextInt();
int a[]=new int[size];

System.out.println("enter array of element");
for(int i=0;i<=a.length-1;i++)
{
	a[i]=sc.nextInt();
}
ArrayAssignment a2=new ArrayAssignment();
a2.average(a);
	}

}
