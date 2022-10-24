package td1.original.api.general.bigburger;

import td1.original.api.general.BurgerBuilder;
import td1.original.api.general.BurgerRestaurant;
import td1.original.api.general.MenuType;
import td1.original.api.general.MeatType;
import td1.original.api.general.SauceType;
import td1.original.api.general.Size;

public class BigBurgerRestaurant implements BurgerRestaurant
{

    private static BigBurgerRestaurant instance = null;

    private BigBurgerRestaurant() {
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new BigBurgerRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerBuilder order_menu(MenuType menu) {
        BurgerBuilder b = null;
        switch (menu) {
            case MEAT_MENU:
                b = new BigBurgerBuilder("BigMarcel", Size.BIG, MeatType.BEEF).with_sauce(SauceType.BURGER).with_onions().with_tomato();
                break;
            case FISH_MENU:
                b = new BigBurgerBuilder("FiletO'Poisson", Size.MEDIUM, MeatType.WHITEFISH).with_sauce(SauceType.BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                b = new BigBurgerBuilder("MaxeeCheesee", Size.MEDIUM, MeatType.BEEF).with_cheese().with_onions();
        }
        return b;
    }

    @Override
    public BurgerBuilder order_personal(Size size, MeatType type) {
        return new BigBurgerBuilder("Own style", size, type);
    }

}
