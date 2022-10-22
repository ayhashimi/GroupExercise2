package task3;

public class Sedan extends Car
{
    int length;

    public Sedan(double carPrice, String color, int length)
    {
        super(carPrice, color);
        this.length = length;
    }

    public double calculateSalePrice()
    {
        if (length > 20)
        {
            return (carPrice - (carPrice * .05));
        }
        else
        {
            return (carPrice - (carPrice * .1));
        }
    }
}
