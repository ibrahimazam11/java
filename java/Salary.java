import java.util.Scanner;
public class Salary
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int count=1,b=0;
float a=0,Da=0,Ma=1500,Hr=0,Pf=0,Total=0;
for(count=1;count<=100000;count++)
{
System.out.println("Enter 2 to calculate salary or Enter 1 to exit");
b=input.nextInt();
switch(b)
{
case 1:{
          
 System.out.println("Good bye");
break;
       }

case 2:
      { 
     System.out.println("Enter Salary"); 
     a=input.nextInt();
     if(a>10000)
               {     
                Da=a/2;
                }
     
     if(a>20000)
                {
                 Da=(a/100)*25;
                 }
     
     
     System.out.println("Enter value of HR(must be less than 10000");
     Hr=input.nextInt();
     if(Hr>10000)
     {
     System.out.println("Enter value of HR(must be less than 10000");
     Hr=input.nextInt();
     }

     
      
      
      System.out.println("Enter value of PF(must be less than 10000");
      Pf=input.nextInt();
      if(Pf>10000)
      {
      System.out.println("Enter value of PF(must be less than 10000");
      Pf=input.nextInt();}
      

     Total=(a+Da+Hr+Ma)-Pf;
     System.out.printf("Total Salary=%f", Total);
     }
      
 
default: 
          {
            System.out.println("Wrong Entry");
            }
}
}
 }
}
