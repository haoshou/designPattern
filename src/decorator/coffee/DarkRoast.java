package decorator.coffee;

import decorator.Beverage;
//焦炒咖啡
public class DarkRoast extends Beverage {
	public DarkRoast(){
		description = "DarkRoast";
	}
	public double cost() {
		return .99;
	}
}
