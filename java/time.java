import java.util.Scanner;
class times{
    int hour=0,min,sec;
    Scanner d = new Scanner(System.in);
    times(){
        hour=8;
        min=45;
        sec=30;
    }
    times(int x){
        hour=x;
        min=45;
        sec=56;
    }
    void hour1(){
        System.out.println("Enter hours: ");
        hour=d.nextInt();
        if(hour>24){
            System.out.println("Hours cannot be greater then 24");
            System.out.println("Enter hours: ");
            hour=d.nextInt();
        }
    }
    void min1(){
    System.out.println("Enter minutes: ");
        min=d.nextInt();    
        if(min>60){
            System.out.println("Minutes cannot be greater then 60");
            System.out.println("Enter minutes: ");
            min=d.nextInt();
        }
    }
    void sec1(){
        System.out.println("Enter seconds: ");
        sec=d.nextInt();
        if(sec>60){
            System.out.println("Seconds cannot be greater then 24");
            System.out.println("Enter Seconds: ");
            sec=d.nextInt();
        }
    }
    void display(){
        System.out.printf("%s %d %s %d %s %d","Time is ",hour,":",min,":",sec);
    }
}
public class time
{
    public static void main(String []args){
  times asd = new times();
  asd.display();
  times asd1=new times(6);
  asd1.display();
 
 
  asd.hour1();
  asd.min1();
  asd.sec1();
  asd.display();
  
}
}