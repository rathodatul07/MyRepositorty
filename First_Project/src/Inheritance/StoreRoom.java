package Inheritance;

public class StoreRoom {

	public static void main(String[] args) {
		
		ElectronicDevice e1=new TeleVision();
		e1.doSale(4, 500000);
		
		e1=new WashingMachine();
		e1.doSale(9, 200000);
		e1=new	Fridge();
		e1.doSale(7, 78777);
		
		

	}

}
