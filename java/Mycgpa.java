import java.util.Scanner;
class student{
int roll;    
double cgpa;
String Name;        
void set(int x)

{        
roll=x;    
}
 student(){
 roll=214;
 Name="Ehsan";        
 cgpa=2.9;    
}    
student(int b)
{      
roll=b;        
Name="Ehsan";        
cgpa=2.9;    }    
student (int x, double c)
{        
roll=x;        
cgpa=c;        
Name="Ehsan";
   }   
 student(int x, double c, String abc)
{        
roll=x;        
cgpa=c;        
Name=abc;    
}    
void display()
{        
System.out.println("Roll no: "+roll);
        
System.out.println("Name: "+Name);       
 System.out.println("Cgpa: "+cgpa);    
}    
}
public class Mycgpa{    
public static void main(String []args)
{    
int x;    
Scanner i= new Scanner(System.in);
    student abc = new student();    
System.out.println("Enter Roll no: ");    
x=i.nextInt();    
abc.set(x);    
abc.display();    
student abc1 = new student(000);    
abc1.display();    
student abc2 = new student(000,3.1);
abc2.display();    
student abc3 = new student (88,3.0,"Ehsan");
abc3.display();
}
}