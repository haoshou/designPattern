package factory.simpleFactory;

public class SimplePizzaFactory {
	Pizza pizza;

	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		}
		return pizza;
	}
}
