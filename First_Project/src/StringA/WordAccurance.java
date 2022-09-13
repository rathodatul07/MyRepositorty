package StringA;

public class WordAccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Good Morning Welcome to Indiab to";
		String word[]=s.split(" ");
		for(int j=0;j<word.length;j++)
		{
			System.out.println(word[j]);
		}
char c[]=s.toCharArray();
//String c[]=s.split("");
        int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			//if(c[i]==' ')
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
