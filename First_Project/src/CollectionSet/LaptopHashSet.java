package CollectionSet;

public class LaptopHashSet {
	String os_name;
	String l_brand;
	int l_Price;
	
	

	public LaptopHashSet(String os_name, String l_brand, int l_Price) {
		super();
		this.os_name = os_name;
		this.l_brand = l_brand;
		this.l_Price = l_Price;
	}

	public String toString()
	{
		return "\nos_name:"+os_name+"\nl_brand : "+l_brand+"\nl_Price: "+l_Price;
	}
	  
	public int hashCode()
	{		
		return os_name.hashCode()+l_brand.hashCode();
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
			
		}
		if(obj==null || this.getClass()!=obj.getClass())
		{
			return false;
		}
		LaptopHashSet l=(LaptopHashSet)obj;
		return this.os_name.equals(l.os_name)&&this.l_brand.equals(l.l_brand)&&this.l_Price==l.l_Price;
	}
}
