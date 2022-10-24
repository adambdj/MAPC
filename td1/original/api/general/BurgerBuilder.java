package td1.original.api.general;

public interface BurgerBuilder {

    BurgerBuilder with_cheese();

    BurgerBuilder with_onions();

    BurgerBuilder with_sauce(SauceType sauce);

    BurgerBuilder with_tomato();

    Burger cook();
}
