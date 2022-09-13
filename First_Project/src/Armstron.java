
public class Armstron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=155;

int temp=input;
int sum=0;
while(input!=0)
{
	int rem=input%10;
	sum=sum+(rem*rem*rem);
	input/=10;
}
if(temp==sum)
{
	System.out.println("arm");
}
else
{
	System.out.println("not");
}
	}

}
