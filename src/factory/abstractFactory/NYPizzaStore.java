package factory.abstractFactory;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("纽约的奶酪披萨");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("纽约的蔬菜披萨");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("纽约的蛤蜊披萨");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("纽约风格的意大利辣香肠披萨");
 
		} 
		return pizza;
	}
}
