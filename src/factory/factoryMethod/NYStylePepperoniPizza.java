package factory.factoryMethod;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
		name = "纽约风格的意大利辣香肠披萨";
		dough = "薄面团";
		sauce = "纯番茄酱";
 
		toppings.add("碎雷奇亚干酪奶酪");
		toppings.add("意大利辣香肠片");
		toppings.add("大蒜");
		toppings.add("洋葱");
		toppings.add("蘑菇");
		toppings.add("红辣椒");
	}
}
