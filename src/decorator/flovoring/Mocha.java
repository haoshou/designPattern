package decorator.flovoring;

import decorator.Beverage;
import decorator.CondimentDecorator;

//摩卡
public class Mocha extends CondimentDecorator{
	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription() + ",Mocha";
	}

	public double cost(){
		return  .20 + beverage.cost();
	}
}
