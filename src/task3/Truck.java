package task3;



public class Truck extends Car
{
    int weight;

    public Truck(double carPrice, String color, int weight)
    {
        super(carPrice, color);
        this.weight = weight;
    }

    public double calculateSalePrice()
    {
        if (weight > 2000)
        {
            return (carPrice - (carPrice * .1));
        }
        else
        {
            return (carPrice - (carPrice * .2));
        }
    }
}



