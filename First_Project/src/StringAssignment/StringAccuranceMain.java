package StringAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAccuranceMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Input_from_question = br.readLine();

		String[] word = Input_from_question.split(" ");
		int count;
		for (int i = 0; i < word.length; i++) {

			if (word[i] == "0")
				continue;
			count = 1;
			for (int j = i + 1; j < word.length; j++) {

				if (word[i].equals(word[j])) {
				count++;
					word[j] = "0";
				}
			}

			System.out.println(word[i]);
			System.out.println(count);

		}

	}

}
