package LooseCoupling;


import Polymorphism1.Person;

class StudyLooseCopuling {

	public static void main(String[] args) 
	{
		
		NonACCar car = new NonACCar("BMW", "Black");
		Person p = new Person(25,"Mr.X",car);
		
		p.planforVacation();
		
	}

}
 