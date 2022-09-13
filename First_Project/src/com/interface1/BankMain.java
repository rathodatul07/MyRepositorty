package com.interface1;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new SBI();
		System.out.println("Rate of Interest of SBI:"+b.rateOfInterest());
		b=new PNB();
		System.out.println("Rate of Interest of PNB:"+b.rateOfInterest());
		
	}

}
