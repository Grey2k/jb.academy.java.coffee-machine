package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.run();
    }

    public void run() {
        IngredientsCalculator calculator = new IngredientsCalculator();
        DefaultRecipie recipie = new DefaultRecipie();

        Scanner sc = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");
        int cups = sc.nextInt();

        calculator.calculateIngredients(recipie, cups);
    }
}
