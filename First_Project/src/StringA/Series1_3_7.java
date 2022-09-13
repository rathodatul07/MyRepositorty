package StringA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Series1_3_7 {

	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input_from_question=br.readLine();
		int n=Integer.parseInt(input_from_question);
		int pr=0;
		input_from_question="";
		for(int i=0;i<=n;i++)
		{
			i=(i*2)+1;
			input_from_question+=i+" ";
		}
		System.out.println(input_from_question);
	}

}
