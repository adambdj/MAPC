package td5;

public class HouseBlend extends Beverage
{
    private String description;
    private double cost;

    public HouseBlend(String d, double c)
    {
        this.description = d;
        this.cost = c;
    }

    @Override
    public String getDescription()
    {
        return this.description;
    }

    @Override
    public double cost()
    {
        return this.cost;
    }
}
