class Shape {
void draw() 
{ 
System.out.println ("Shape"); 
}
}
class Circle extends Shape {
 void draw() 
 { 
 System.out.println ("Circle"); 
 }
}
class Line extends Shape 
{
 void draw() 
 { 
 System.out.println ("Line"); 
 }
}
class Rectangle extends Shape 
{
 void draw() 
 {
 System.out.println ("Rectangle"); 
 }
}
class shapes
{
public static void main(String args[])
{
Shape[] s = new Shape[3];
s[0] = new Circle();
s[1] = new Line(); 
s[2] = new Rectangle();
for (int i = 0; i < s.length; i++){
s[i].draw(); // prints Circle, Line, Rectangle
}
}
}