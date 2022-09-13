package Enumm1;

enum softy
{
	VANILA(80,2),MANGO(90,12),BUTTERCOTCH(110,4);
	int price,qty,bill;
	softy(int price,int  qty)
	{
	this.price=price;
	this.qty=qty;
	}
	public int getPrice()
	{
		return price;
	}
	public int getQty()
	{
		return qty;
	}
	public void  setBill()
	{
		System.out.println("total BILL of"+ MANGO+ "is: "+(price*qty));
	}
}
public class IceCream {
	
	public static void main(String[] args) {
		softy s=softy.MANGO;
		switch(s)
		{
		case VANILA:
			s.setBill();
			break;
			
		case MANGO:
			s.setBill();
			break;
			
		case BUTTERCOTCH:
			s.setBill();
			break;
		}

	}

}
