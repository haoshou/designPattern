package factory.factoryMethod;

import java.util.ArrayList;

abstract public class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	void prepare() {
		System.out.println("准备中： " + name);
		System.out.println("揉面中...");
		System.out.println("加酱料...");
		System.out.println("加馅料: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}

	void bake() {
		System.out.println("烘烤25分钟");
	}

	void cut() {
		System.out.println("把披萨切片");
	}

	void box() {
		System.out.println("将披萨放在正式的披萨盒里");
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String) toppings.get(i) + "\n");
		}
		return display.toString();
	}
}
