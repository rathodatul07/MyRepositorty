package CollectionHashMap;

public class Custom {
int id;
String name;
public Custom(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public String toString()
{
	return "\nid:"+id+"\nname:"+name;
}
/*public int hashCode()
{
	int answer=0;
	answer=id-name.hashCode();
	return answer;
}*/
}
