package factory.factoryMethod;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "纽约风格蛤披萨";
		dough = "薄面团";
		sauce = "纯番茄酱";

		toppings.add("碎雷奇亚干酪奶酪");
		toppings.add("来自长岛海峡的新鲜蛤蜊");
	}
}
