public class PrivateCar
{
  private String make;
  private String model;
  private int year;

public void setMake(String make)
{
  this.make=make;
}
public void setModel(String model)
{
  this.model=model;
}
public void setYear(int year)
{
  this.year=year;
}
public void displayInfo()
{
  System.out.println("Make is:"+ make);
  System.out.println("Model is:"+ model);
  System.out.println("Year is:"+ year);
}
public static void main(String[] args)
{
 PrivateCar p1=new PrivateCar();
 p1.setMake("Japan");
 p1.setModel("Hybrid");
 p1.setYear(2023);
 p1.displayInfo();
}
}
