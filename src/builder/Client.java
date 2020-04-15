package builder;

public class Client {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder cheezePizzaBuilder = new CheezePizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(cheezePizzaBuilder);
        waiter.buildPizza();

        Pizza pizza = waiter.getPizza();
    }

}
