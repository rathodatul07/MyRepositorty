package Containment;

public class Outhouse 
{
int outhouseNo;
double outhouseArea;
Outhouse(int ono,double oArea)
{
	outhouseNo=ono;
	outhouseArea=oArea;
}
public String toString()
{
	String str="\nouthouseNo:"+outhouseNo+"\nouthArea:"+outhouseArea;
    return str;
}
}
