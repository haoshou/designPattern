package factory.factoryMethod;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "芝加哥深盘蔬菜披萨";
		dough = "额外的厚皮比萨面团";
		sauce = "李子番茄酱";

		toppings.add("马苏里拉奶酪丝");
		toppings.add("乌榄");
		toppings.add("菠菜");
		toppings.add("茄子");
	}
 
	void cut() {
		System.out.println("把披萨切成方形");
	}
}
