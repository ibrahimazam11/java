import java.util.Scanner;
public class menu
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int x, a,b;
float c,d;
System.out.printf("Press 1 for Calculator\nPress 2 for Palindrome\nPress 3 for Fibonacci series\nPress 4 for GPA\n Press 5 for CGPA\n");
System.out.println("Enter your choice");
x=input.nextInt();
switch(x)
{
case 1:
{
       System.out.println("Enter number 1");
       a=input.nextInt();
       System.out.println("Enter number 2");
       b=input.nextInt();
       calculator(a,b);
       break;
}

case 2:
{
       System.out.println("Enter number to check whether it is palindrome or not ");
       a=input.nextInt();
       palindrome(a);
       break;
}
case 3:
{
       System.out.println("How many numbers do you want? ");
       a=input.nextInt();
       fibonacci(a);
       break;
}
case 4:
{   
       
       gpa();
       break;
}
case 5:
{
       cgpa();
       break;
}
default:
{
System.out.println("Wrong input");
}
}
}
 public static int calculator(int a,int b){

Scanner input=new Scanner(System.in);
int c;
System.out.println("Press 1 for Addition\n Press 2 for Subtraction\n Press 3 for multiplication\n Press 4 for division");
System.out.println("Enter your choice");
c=input.nextInt();

switch(c)
        {

case 1:
       {
       int sum=a+b;
       System.out.printf("Result of Addition is %d",sum); 
       break;
       } 

case 2:
       {
        int sub=a-b;
        System.out.printf(" Result of Subtraction is %d",sub);
        break;
       }

case 3:
       {
        int mul=a*b;
        System.out.printf(" Result of Multiplication is %d",mul);
        break;
       }

case 4:
       {
        int div=a/b;
        System.out.printf(" Result of Division is %d",div);
        break;
       }
}
 
return 0;
}

public static int palindrome(int a)
{
int t,r=0;
t=a;
   while( t != 0 )
   {
      r = r * 10;
      r = r + t%10;
      t= t/10;
   }
 
   if ( a == r )
     System.out.printf("%d is a palindrome number.\n", a);
   else
      System.out.printf("%d is not a palindrome number.\n", a);
 
   return 0;
}

public static int fibonacci(int a)
{
          int x=0,y=1,z;
          System.out.println("Fibonacci Series:-");
          System.out.print("\n"+x+"\t");
          System.out.print(y+"\t");
          for(int count=0;count<a-2;count++)
             {
                 z=x+y;
                 x=y;
                 y=z;
                 System.out.print(z+"\t");
}
return 0;
}

public static int gpa()
{
Scanner input=new Scanner(System.in);
int a=0;
float b=0,c=0,e=0,gpa=0,d=0;
System.out.println("Enter total number of subjects");
a=input.nextInt();
for(int count=1;count<=a;count++)
{
System.out.println("Enter gpa of subject");
b=input.nextFloat();
System.out.println("Enter credit hours of subject");
c=input.nextFloat();
d=c+d;
e=(b*c)+e;
}
gpa=e/d;
System.out.println("Gpa="+gpa);
return 0;
}

public static int cgpa()
{
Scanner input=new Scanner(System.in);
int a=0,b;
float f=0,c=0,e=0,cgpa=0,d=0;
System.out.println("Enter total number of semester");
b=input.nextInt();
System.out.println("Enter total number of subjects");
a=input.nextInt();
for(int count=1;count<=b;count++)
{
System.out.printf("semester number %d\n\n",count);
for(int counter=1;counter<=a;counter++)
{
System.out.println("Enter gpa of subject");
f=input.nextFloat();
System.out.println("Enter credit hours of subject");
c=input.nextFloat();
d=c+d;
e=(f*c)+e;
}
}
cgpa=e/d;
System.out.println("CGpa="+cgpa);
return 0;
}
}


