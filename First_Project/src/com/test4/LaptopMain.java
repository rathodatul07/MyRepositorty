package com.test4;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystem os=new OperatingSystem();
		os.setOsName("Windows 10");
		os.setVendor("HP ");
		os.setVersion(12.4f);
		
		
		Laptop l=new Laptop("Akshay",40000,os);
		System.out.println(l);
		l.setBrand("HP");
		l.setCost(35000);
		l.setOs(os);
		

	}

}
