package td1.original.api.general;

public class Meat implements FoodProduct {

    private MeatType type;
    private double weight;

    public Meat(MeatType type, double weight)
    {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price()
    {
        return type.price() * weight / 100;
    }

    @Override
    public double weight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }

    @Override
    public double calorie_per_100g()
    {
        return type.calorie_per_100g();
    }
}
