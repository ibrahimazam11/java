abstract class Bankaccount
{
int cbal;
String name;
int accnum;

void deposit()
{

}

void setbalance(int a)
{
cbal=a;
}

int getbalance()
{
return cbal;
}


void setaccountnum(int b)
{
accnum=b;
}

int getaccountnum()
{
return accnum;
}

}


class savingaccount extends Bankaccount
{

void deposit()
{
int adepo=40000;
int totaldep;


totaldep= cbal-adepo;
System.out.println("You have Deposited: " +totaldep);
}

void method()
{
double interest;

if(cbal>50000)
{
interest= 2/100*cbal;
System.out.println("The Interest added is: " +interest);
}
}
}

public class Sohaib
{
public static void main(String args[])
{
savingaccount ob1=new savingaccount();

ob1.setbalance(80000);
ob1.setaccountnum(47326);

ob1.deposit();
ob1.method();
}
}

 

