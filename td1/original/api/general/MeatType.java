package td1.original.api.general;

public enum MeatType implements Food
{
        BEEF, WHITEFISH;
        // BEEF : 200 kcal / 100g
        // WHITEFISH : 170 kcal / 100g

    public double price() {
        double rtr;
        switch (this) {
            case WHITEFISH:
                rtr = 6;
                break;
            case BEEF:
            default:
                rtr = 4;
        }
        return rtr;
    }

    @Override
    public double calorie_per_100g() {
        double rtr;
        switch (this) {
            case WHITEFISH:
                rtr = 170;
                break;
            case BEEF:
            default:
                rtr = 200;
        }
        return rtr;
    }
}
