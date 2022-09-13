package Containment;

public class Market
{
String marketName;
double marketArea;
Shop sp;
Market(String mname,double marea,Shop s)
{
	marketName=mname;
	marketArea=marea;
	sp=s;
}
public String toString()
{
	String str1="\nmarketName:"+marketName+"\nmarket Area:"+marketArea+sp;
    return str1;
}
}
