package Containment;

public class InsMain {

	public static void main(String[] args) {

		Institute i=new Institute(1,"terna Institute");
		InsBranch b=new InsBranch(2,"Ajay","cse",i);
		InsSubject s=new InsSubject(3,"Ajay","cse",i,b);
		System.out.println(s);
		
	}

}
 