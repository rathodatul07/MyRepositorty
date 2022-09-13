package CollectionLinkedList;

public class ActorAss
{
int act_id;
String act_name;
public ActorAss(int act_id, String act_name) {
 	super();
	this.act_id = act_id;
	this.act_name = act_name;
} 

public String toString()
{
	return "\n"+act_id+"\n"+act_name;
}
}

class Movie
{
	int budget;
	int role;
	String m_name;
	String m_producer;
	ActorAss obj;
	public Movie(String m_name,String m_producer, int budget, int role, ActorAss obj) {
		
		this.budget = budget;
		this.role = role;
		this.m_name = m_name;
		this.m_producer = m_producer;
		this.obj = obj;
	}
	public String toString()
	{
		return "\n"+m_name+"\n"+m_producer+"\n"+budget+"\n "+role+"\n "+obj;
	}
	
}
