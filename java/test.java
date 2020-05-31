import java.util.Scanner;

class student2
{

int roll;
String name;
double cgpa;

student2(String c, double g)
{

name=c;
cgpa=g;
}



public void set(int x)
{
Scanner input = new Scanner(System.in);
System.out.print("enter roll no. : ");
x=input.nextInt();
roll=x;
}

}

class test
{

public static void main(String[] args)
{

student2 my = new student2("ibo",3.3);
System.out.printf("%f",my.cgpa);

set();
//System.out.printf("%d",.roll);
}
}
