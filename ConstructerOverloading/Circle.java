public class Circle
{
private float radius;

public Circle(float r)
{
radius=r;
}
public Circle(Circle c)
{
this.radius=c.radius;
}
public void displayInfo()
{
System.out.println("Value:"+ radius);
}
public static void main(String[] args)
{
Circle c1=new Circle(7.0f);
Circle c2=new Circle(c1);
c1.displayInfo();
c2.displayInfo();
}
}