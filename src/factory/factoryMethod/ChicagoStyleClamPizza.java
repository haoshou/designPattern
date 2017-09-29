package factory.factoryMethod;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "芝加哥风格蛤披萨";
		dough = "额外的厚皮比萨面团";
		sauce = "李子番茄酱";
 
		toppings.add("马苏里拉奶酪丝");
		toppings.add("切萨皮克湾的冰冻蛤蜊");
	}
 
	void cut() {
		System.out.println("把披萨切成方形");
	}
}
