package Methods;

public class Exam 
{
		public Semester calculateResult(Semester obj1,Semester obj2)
		{
			Semester finalResult=new Semester();
			finalResult.m1=obj1.m1;
			finalResult.m2=obj1.m2;
			finalResult.m3=obj1.m3;
			finalResult.roll_no=obj1.roll_no;
			return finalResult;
			
		}

	public static void main(String[] args) {
		
		Exam e=new Exam();
		Semester s1=new Semester();
		s1.showDisplay();
		s1.AcceptDetail();
		Semester s2=new Semester();
		
	}

}
