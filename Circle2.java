public class Circle2
{
  public float radius;

public void display()
  {
    System.out.println("Radius:"+ radius);
  }
public static void main(String[] args)
  { 
    Circle2 circle2=new Circle2();
    circle2.radius=7.0f;
    circle2.display();
  }
}