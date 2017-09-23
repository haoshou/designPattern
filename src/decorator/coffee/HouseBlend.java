package decorator.coffee;

import decorator.Beverage;

//首选咖啡（星巴克咖啡名）
public class HouseBlend extends Beverage {
	public HouseBlend(){
		description = "House Blend Coffee";
	}

	public double cost() {
		return .99;
	}
}
