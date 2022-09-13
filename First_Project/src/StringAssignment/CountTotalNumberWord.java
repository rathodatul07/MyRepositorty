package StringAssignment;

public class CountTotalNumberWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Atul Rathod Ajay Jadhav Atul";
		char c[] = s.toCharArray();
		String s1 = " ";
		char ch[] = s1.toCharArray();
		int count = 1;
		for (int i = 0; i <= s.length() - 1; i++)
		{
			if (c[i] == ' ' && c[i + 1] != ' ') {
				count++;
			}

		}
		System.out.println(" : " + count);
	}

}
