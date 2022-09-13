package StringA;

import java.util.Scanner;

public class VowelsConsonantDigitWhiteSpace 
{


	public static void main(String[] args)
	{
		String s1="Welcome to India";

		int consonant=0;
		int vowels=0;
		int digit=0;
		int space=0;

		String s2=s1.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			char c=s2.charAt(i);
			char ch=s1.charAt(i);

			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vowels++;
			}

			else if(ch>='0' && ch<= '9')
			{
				digit++;
			}
			else if(ch==' ')
			{
				space++;
			}
			else 
			{
				consonant++;
			}
		}
		System.out.println("\ncount of Vowels Are:"+vowels+"\ncount of consonant:"+consonant+"\ncount of digit are: "+digit+"\ncount of spaces are "+space);
	}
}