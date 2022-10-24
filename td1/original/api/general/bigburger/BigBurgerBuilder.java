package td1.original.api.general.bigburger;

import java.util.ArrayList;
import java.util.List;

import td1.original.api.general.BurgerBuilder;
import td1.original.api.general.Burger;
import td1.original.api.general.Cheddar;
import td1.original.api.general.DeepFriedOnions;
import td1.original.api.general.FoodProduct;
import td1.original.api.general.Meat;
import td1.original.api.general.MeatType;
import td1.original.api.general.SauceType;
import td1.original.api.general.Sauce;
import td1.original.api.general.Tomato;
import td1.original.api.general.Size;

public class BigBurgerBuilder implements BurgerBuilder
{
    private String name;
    private List<FoodProduct> products;

    BigBurgerBuilder(String name, Size size, MeatType type)
    {
        this.name = name;
        double weight_for_size;
        switch (size) {
            case SMALL:
                weight_for_size = 100;
                break;
            case MEDIUM:
                weight_for_size = 200;
                break;
            case BIG:
            default:
                weight_for_size = 400;
        }
        this.products = new ArrayList<>();
        this.products.add(new Meat(type, weight_for_size));
    }

    @Override
    public BurgerBuilder with_sauce(SauceType sauce) {
        this.products.add(new Sauce(sauce, 20));
        return this;
    }

    @Override
    public BurgerBuilder with_onions() {
        this.products.add(new DeepFriedOnions(20));
        return this;
    }

    @Override
    public BurgerBuilder with_tomato() {
        this.products.add(new Tomato(10));
        return this;
    }

    @Override
    public BurgerBuilder with_cheese() {
        this.products.add(new Cheddar(30));
        return this;
    }

    @Override
    public Burger cook() {
        return new BigBurger(name, products);
    }
}
