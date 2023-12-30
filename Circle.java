public class Circle
{
private float radius;

public Circle()
{
radius=7.0f;
}
public float getRadius()
{
return radius;
}
public static void main(String[] args)
{
Circle c1=new Circle();
System.out.println(c1.getRadius());
}
}