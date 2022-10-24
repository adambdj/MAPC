package td1.original.api.general;

public interface BurgerRestaurant
{
    BurgerBuilder order_menu(MenuType menu);

    BurgerBuilder order_personal(Size size, MeatType type);
}
