package CollectionHashMap;

public class SupplierTree 
{
int sup_id;
String sup_name;
public SupplierTree(int sup_id, String sup_name) {
	super();
	this.sup_id = sup_id;
	this.sup_name = sup_name;
}

public String toString()
{
	return "sup_id: "+sup_id+" sup_name: "+sup_name;
}
}
