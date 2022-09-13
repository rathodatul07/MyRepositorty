package StringAssignment;

public class StringWhiteSpace {

	public static void main(String[] args) {
		String s = "I am Learning java";
		String word[] = s.split("");
		//int i;
		String empstr="";
		int cnt=1;
		int wsps=3;
		for(String w:word)
		{
			empstr+=w;
			if(cnt<word.length)
				for(int i=1;i<=wsps*cnt;i++)
					empstr+="-";
			
			cnt++;
			//break;
		}
		System.out.println(empstr);
		
		
				}
	

}
