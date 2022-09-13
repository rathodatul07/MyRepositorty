package CollectionLinkedList;

public class Student 
{
	Integer id;
	String name;
	Integer phy;
	Integer chem;

	public Student(int id, String name,int phy,int chem) 
	{
		
		this.id = id;
		this.name = name;
		this.phy=phy;
		this.chem=chem;
	}
	public String toString()
	{
		return id+" "+name+" "+phy+" "+chem;
	}
}

