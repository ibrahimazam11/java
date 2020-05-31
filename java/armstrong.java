import java.util.Scanner;
public class armstrong
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int a,b,x,sum=0;
System.out.print("Enter a number :");
a=input.nextInt();
b=a;

while(b!=0)
{
x=b%10;
sum=sum+x*x*x;
b=b/10;
}
if(sum==a)
{
System.out.print("Its an Armstrong number");
}
else
{
System.out.print("Its not an armstrong number");
}
}
}