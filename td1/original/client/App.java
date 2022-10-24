package td1.original.client;

import td1.original.api.general.*;
import static td1.original.api.general.MeatType.*;
import static td1.original.api.general.MenuType.*;
import static td1.original.api.general.Size.*;
import static td1.original.api.general.SauceType.*;

import static td1.original.api.general.Price.*;

import  td1.original.api.general.bigburger.BigBurgerRestaurant;
import  td1.original.api.general.macdeau.MacDeauRestaurant;



import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String args[])
    {
        BurgerAdvisor.register(CHEAP, MacDeauRestaurant.queue());
        BurgerAdvisor.register(EXPENSIVE, BigBurgerRestaurant.queue());
        BurgerAdvisor advisor = BurgerAdvisor.instance();

        Burger alice_dinner = advisor
                .select(CHEAP)
                .order_menu(FISH_MENU)
                .cook();

        Burger bob_dinner = advisor
                .select(CHEAP)
                .order_menu(MEAT_MENU)
                .with_onions()
                .with_cheese()
                .cook();

        Burger charles_dinner = advisor
                .select(EXPENSIVE)
                .order_personal(BIG, BEEF)
                .with_onions()
                .with_cheese()
                .with_sauce(BARBECUE)
                .with_sauce(BEARNAISE)
                .with_sauce(BURGER)
                .with_cheese()
                .cook();
        List<Burger> dinners = Arrays.asList(
                alice_dinner,
                bob_dinner,
                charles_dinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}
