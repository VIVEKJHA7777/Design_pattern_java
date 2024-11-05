package BuilderDesignPattern.Problem1;

public class Client {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza.pizzaBuilder()
                .setSize("Large")
                .setCrust("Thick")
                .setCheeseType("Mozzarella")
                .setToppings("Pepperoni")
                .setToppings("Mushrooms")
                .setExtras("Extra Cheese")
                .build();

        System.out.println(myPizza);

    }
}
