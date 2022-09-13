package CollectionHashMap;

public class CountWordAssignment {
	public int find_highest_saving(int salary[], int expenses[]) {
		int highest_saving = 0;
		for (int i = 0; i < salary.length; i++) {
			int diff = salary[i] - expenses[i];
			if (diff > highest_saving) {
				highest_saving = diff;
			}
		}
		return highest_saving;
	}

	public static void main(String[] args)
	{
		int salary[] = { 200, 200, 200 };
		// System.out.println();
		int expenses[] = { 20, 20, 20 };
		// TODO Auto-generated method stub
		CountWordAssignment c = new CountWordAssignment();
		c.find_highest_saving(salary, expenses);
	}

}