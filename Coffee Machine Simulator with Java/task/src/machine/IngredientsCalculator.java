package machine;

public class IngredientsCalculator {
    public void calculateIngredients(Recipie recipie, int cups) {

        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(recipie.getWater() * cups + " ml of water");
        System.out.println(recipie.getMilk() * cups + " ml of milk");
        System.out.println(recipie.getCoffeeBeans() * cups + " g of coffee beans");
    }
}
