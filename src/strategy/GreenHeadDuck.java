package strategy;

public class GreenHeadDuck extends Duck {
	public GreenHeadDuck() {
		quackBehavior = new Squack();
		quackBehavior.quack();
		flyBehavior = new FlyWithWings();
		flyBehavior.fly();
	}
}
