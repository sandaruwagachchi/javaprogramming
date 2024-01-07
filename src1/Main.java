public class Main
{
    public static void main(String[] args)
    {
        Pizza pizza=new Pizza();
        pizza.size="Medium";
        pizza.topping=2;
        pizza.calculateTotalPrice();
        pizza.displayInfo();
    }
}
