package Array;

public class AddingFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,4,6,9,33,14,19};
int num=arr[0];
System.out.println(num);
for(int i=0;i<arr.length-1;i++)
{
	if(num+5==arr[i])
	{
		
		num=arr[i];
		System.out.println(num);
	}
	//
}
	}

}
