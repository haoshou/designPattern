package strategy;

/**
 * 抽象父类Duck
 */
public abstract class Duck {
	FlyBehavior flyBehavior;	//面向接口编程
	QuackBehavior quackBehavior;

	void fly() {
		flyBehavior.fly();
	}

	void quack() {
		quackBehavior.quack();
	}

	void swim() {
		System.out.println("swiming");
	}

	void display() {
		System.out.println("displaying");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
}
