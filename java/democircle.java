public class circle
{
double r;
double pie;

public double area(double r, double pie)
{
double area,cir;
area=pie*r*r;
cir=2*pie*r;
System.out.println("Area = "+area);
System.out.println("Circumference = "+cir);
}}
public class democircle
{
public static void main(String[] args)
{
circle mycircle =new circle();
mycircle.r=5;
mycircle.pie=3.147;
mycircle.area();

}
}
