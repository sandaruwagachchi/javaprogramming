public class Circle
{
private float radius;

public Circle(float r)
{
radius=r;
}
public float getRadius()
{
return radius;
}
public static void main(String[] args)
{
Circle c1=new Circle(7.0f);
System.out.println(c1.getRadius());
}
}