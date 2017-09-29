package factory.simpleFactory;

import java.util.ArrayList;

abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("正在做： " + name);
	}

	public void bake() {
		System.out.println("烘烤中： " + name);
	}

	public void cut() {
		System.out.println("切片中： " + name);
	}

	public void box() {
		System.out.println("打包中： " + name);
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append(toppings.get(i) + "\n");
		}
		return display.toString();
	}
}
