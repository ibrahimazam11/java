import java.util.Scanner;
public class add
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int num1,num2,sum;
System.out.print("Enter 1 number : ");
num1=input.nextInt();
System.out.print("Enter 2 number : ");
num2=input.nextInt();
sum=num1+num2;
System.out.printf("Sum=%d",sum);

}
}