package td1.original.api.general.macdeau;

import td1.original.api.general.BurgerRestaurant;

import td1.original.api.general.BurgerBuilder;
import td1.original.api.general.BurgerRestaurant;
import td1.original.api.general.MenuType;
import td1.original.api.general.MeatType;
import td1.original.api.general.SauceType;
import td1.original.api.general.Size;

public class MacDeauRestaurant implements BurgerRestaurant
{

    private static MacDeauRestaurant instance = null;

    private MacDeauRestaurant() {
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new MacDeauRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerBuilder order_menu(MenuType menu) {
        BurgerBuilder b = null;
        switch (menu) {
            case MEAT_MENU:
                b = new MacDeauBuilder("Beefy", Size.MEDIUM, MeatType.BEEF).with_sauce(SauceType.BURGER).with_onions().with_cheese();
                break;
            case FISH_MENU:
                b = new MacDeauBuilder("Fishy", Size.SMALL, MeatType.WHITEFISH).with_sauce(SauceType.BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                b = new MacDeauBuilder("Cheesy", Size.SMALL, MeatType.BEEF).with_cheese();
        }
        return b;
    }

    @Override
    public BurgerBuilder order_personal(Size size, MeatType type) {
        return new MacDeauBuilder("Own style", size, type);
    }
}
