package factory.factoryMethod;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		name = "芝加哥风格意大利辣香肠披萨";
		dough = "额外的厚皮比萨面团";
		sauce = "李子番茄酱";
 
		toppings.add("马苏里拉奶酪丝");
		toppings.add("乌榄");
		toppings.add("菠菜");
		toppings.add("茄子");
		toppings.add("切片意大利辣香肠");
	}
 
	void cut() {
		System.out.println("把披萨切成方形");
	}
}
