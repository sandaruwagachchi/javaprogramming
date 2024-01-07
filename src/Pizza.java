public class Pizza {
    String size;
    int topping;
    double totalPrice;

    public double calculateTotalPrice()
    {
        switch (size) {
            case "Small":
                totalPrice = 7.99 + topping * (1.25);
                break;
            case "Medium":
                totalPrice = 9.99 + topping * (1.25);
                break;
            case "Large":
                totalPrice = 11.29 + topping * (1.25);

        }
        return totalPrice;
    }
    public void displayInfo()
    {
        System.out.println("Size:"+ size);
        System.out.println("Topping:"+ topping);
        System.out.println("TotalPrice:"+ totalPrice);

    }

}
