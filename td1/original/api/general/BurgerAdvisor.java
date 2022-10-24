package td1.original.api.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BurgerAdvisor
{

    private static BurgerAdvisor instance = null;

    private static Map<Price, List<BurgerRestaurant>> registry = new HashMap<>();

    private BurgerAdvisor()
    {
    }

    public static BurgerAdvisor instance()
    {
        if (instance == null)
        {
            instance = new BurgerAdvisor();
        }
        return instance;
    }

    public static void register(Price tarif, BurgerRestaurant restaurant)
    {
        if (!registry.containsKey(tarif))
        {
            registry.put(tarif, new ArrayList<>());
        }
        registry.get(tarif).add(restaurant);
    }

    public BurgerRestaurant select(Price tarif)
    {
        return registry.get(tarif).get(0);
    }
}
