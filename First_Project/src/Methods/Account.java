package Methods;

public class Account 
{
	float  acNo;
String achName;
float acBalance;
float amount;
float amount1;

public void openAcount(float accountNumber,String accountName,float accountBalance)
{
	acNo=accountNumber;
	achName=accountName;
	acBalance=accountBalance;
}//imp to work
public String toString()
{
	String Str
}
public void showAcountDetails()
{
	System.out.println("accountNumber: "+acNo +" accountName : "+achName +" accountBalance: "+acBalance);
}
public void depositAmount(float amt)
{
amount =amt;
acBalance=acBalance+amt;
System.out.println("deposited balance are: "+amt+"total amount are:"+acBalance);
}
public void withdrawAmount(float amt)
{
	amount1=amt;
	acBalance=acBalance-amt;
	System.out.println("withraw balance are: "+amt+"total amount are:"+acBalance);
}
public void showUpdateBalance() 
{
	System.out.println("total balance are :"+acBalance);

}
}