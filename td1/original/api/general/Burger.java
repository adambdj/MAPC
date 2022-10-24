package td1.original.api.general;

import java.util.List;

public abstract class Burger implements FoodProduct {

    private String name;
    private List<FoodProduct> items;

    protected Burger(String name, List<FoodProduct> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public double weight() {
        return items.stream().map(Product::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return items.stream().map(Product::price).reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for (Object item : items) {
            buffer.append(String.format("- %s\n", item));
        }
        buffer.append(DELIM);
        buffer.append(String.format("price:         %.2f\n", price()));
        buffer.append(DELIM);
        buffer.append(String.format("calories:      %.2f\n", calories()));
        buffer.append(String.format("calories/100g: %.2f\n", calorie_per_100g()));
        buffer.append(DELIM);



        return buffer.toString();
    }

    @Override
    public double calorie_per_100g()
    {
        return calories() / weight() * 100;
    }

    @Override
    public double calories()
    {
        return items.stream().map(FoodProduct::calories).reduce(0.0, Double::sum);
    }
}
