package td5;

public class DarkRoast extends Beverage
{
    private String description;
    private double cost;

    public DarkRoast(String d, double c)
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
