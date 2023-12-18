public class MyDetails
{
  private String name;
  private int age;

public void setName(String name)
 {
   this.name=name;
 }
public String getName()
 { 
   return name;
 }
public void setAge(int age)
 {
   this.age=age;
 }
public int getAge()
 {
   return age;
 }
public static void main(String[] args)
 {
   MyDetails d1=new MyDetails();
   d1.setName("Sandaru");
   d1.setAge(21);
   System.out.println(d1.getName());
   System.out.println(d1.getAge());
 }
}
 
