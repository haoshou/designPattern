package factory.simpleFactory;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		name = "蛤蜊披萨";
		dough = "薄面团";
		sauce = "白蒜酱";
		toppings.add("蛤蜊");
		toppings.add("磨碎的帕玛森芝士");
	}
}
