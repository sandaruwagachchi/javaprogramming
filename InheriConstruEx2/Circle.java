public class Circle extends Shape
{ 
double radius;

public Circle(double radius)
{
super("Circle",Math.PI * radius * radius);
this.radius=radius;
}
}