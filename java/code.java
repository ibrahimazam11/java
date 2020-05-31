import java.util.Scanner;
public class code
{
public static void main(String[] args)
{
Scanner input=new Scanner (System.in);
int num1;
String word1;
System.out.print("Enter a number and i will echo it later");
num1=input.nextInt();
System.out.print("Entera word and i will echo it later");
word1=input.next();
System.out.println("Here is the echo of what you have entered");
System.out.println("The number you have entered is :"+num1);
System.out.printf("The word you entered is : %s",word1);

}
}