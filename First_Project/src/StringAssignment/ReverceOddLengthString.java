package StringAssignment;

//odd length word reverce 
public class ReverceOddLengthString {
	public void oddLengthThroughWordRevere(String s) {
		String str[] = s.split(" ");
		String ept2 = "";
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() % 2 == 0) {
				System.out.println(str[i]);
				ept2 += str[i] + "";
			} else {
				for (int j = str[i].length() - 1; j >= 0; j--) {
					ept2 += str[i].charAt(j);
				}
				ept2 += "";
			}
		}
		System.out.println(ept2);
	}

	public static void main(String[] args) {
		String s = "Atul Rathod Ujani laman tanda";
		// TODO Auto-generated method stub
		ReverceOddLengthString f = new ReverceOddLengthString();
		f.oddLengthThroughWordRevere(s);
	}

}
