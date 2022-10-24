package td1.original.api.general;

public interface FoodProduct extends Product,Food {
    default double calories() {
        return weight() / 100 * calorie_per_100g();
    }

}