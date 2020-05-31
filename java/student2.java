import java.util.Scanner;

class student2
{

int roll;
String name;
double cgpa;

student2(int r , String c, double g)
{

roll=r;
name=c;
cgpa=g;
}

}

class test
{

public static void main(String[] args)
{

student2 my = new student2(1,"ibo",3.3);
System.out.printf("%s",my.name);

}
}
