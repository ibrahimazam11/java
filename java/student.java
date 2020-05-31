public class student
{
int rollno;
double cgpa;
string name;

student(int x)
{
rollno=x;
cgpa=3.3;
name="ibrahim";
}

student()
{
rollno=5;
cgpa=3.3;
name="ibrahim";
}
}
public class student1
{

public static void main(String[] args)
{
student my=new student();
student my=new student(93);
System.out.printf("\nRoll No. : %d\nName = %s\nCgpa = %f",rollno,name,cgpa);
}
}