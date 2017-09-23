package strategy;

//实现类：绿头鸭
public class GreenHeadDuck extends Duck {
	public GreenHeadDuck() {
		quackBehavior = new Squack();
		quackBehavior.quack();
		flyBehavior = new FlyWithWings();
		flyBehavior.fly();
	}
}
