package ObjArray;

public class Inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i=new Item("Ajay", "Atul", 6);
		System.out.println(i);
		Item i2=new Item("Ajay", "Atul", 6);
		 
		
		if(i.equals(i2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
