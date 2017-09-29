package factory.factoryMethod;

public abstract class PizzaStore {
	abstract Pizza createPizza(String item);

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("---正在做：" + pizza.getName() + "---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
