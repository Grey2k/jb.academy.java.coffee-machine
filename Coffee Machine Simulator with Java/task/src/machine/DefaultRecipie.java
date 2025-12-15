package machine;

public class DefaultRecipie extends Recipie {
    private final int water;
    private final int milk;
    private final int coffeeBeans;

    public DefaultRecipie() {
        this.water = 200;
        this.milk = 50;
        this.coffeeBeans = 15;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }
}
