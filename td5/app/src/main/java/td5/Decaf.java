package td5;

public class Decaf extends Beverage
{
    private String description;
    private double cost;

    public Decaf(String d, double c)
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
