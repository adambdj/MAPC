package td1.original.api.general.macdeau;

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

import java.util.ArrayList;
import java.util.List;

public class MacDeauBuilder implements BurgerBuilder
{

    String name;
    List<FoodProduct> products;

    MacDeauBuilder(String name, Size size, MeatType type) {
        this.name = name;
        double weight_for_size;
        switch (size) {
            case SMALL:
                weight_for_size = 50;
                break;
            case MEDIUM:
                weight_for_size = 100;
                break;
            case BIG:
            default:
                weight_for_size = 200;
        }
        this.products = new ArrayList<>();
        this.products.add(new Meat(type, weight_for_size));
    }

    @Override
    public MacDeauBuilder with_sauce(SauceType sauce) {
        this.products.add(new Sauce(sauce, 40));
        return this;
    }

    @Override
    public MacDeauBuilder with_onions() {
        this.products.add(new DeepFriedOnions(10));
        return this;
    }

    @Override
    public MacDeauBuilder with_tomato() {
        this.products.add(new Tomato(10));
        return this;
    }

    @Override
    public MacDeauBuilder with_cheese() {
        this.products.add(new Cheddar(15));
        return this;
    }

    @Override
    public Burger cook() {
        return new MacDeauBurger(name, products);
    }
}
