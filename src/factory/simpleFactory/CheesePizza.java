package factory.simpleFactory;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		name = "芝士披萨";
		dough = "普通面团";
		sauce = "海员沙司披萨酱";
		toppings.add("新鲜马苏里拉奶酪");
		toppings.add("帕尔马干酪");
	}
}
