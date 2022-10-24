package td1.original.api.general;

public enum SauceType implements Food
{
    BURGER, BARBECUE, BEARNAISE;
        // BURGER : 240 kcal / 100g
        // BARBECUE : 130 kcal / 100g
        // BEARNAISE : 550 kcal / 100g


    @Override
    public double calorie_per_100g()
    {
        double rtr = 0;
        switch (this)
        {
            case BARBECUE:
                rtr = 130;
                break;
            case BEARNAISE:
                rtr = 550;
                break;
            case BURGER:
            default:
                rtr = 240;
        }
        return rtr;

    }
}
