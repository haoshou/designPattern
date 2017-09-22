package strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	void swim() {
		System.out.println("swiming");
	}

	void display() {
		System.out.println("displaying");
	}

	void fly() {
		flyBehavior.fly();
	}

	void quack() {
		quackBehavior.quack();
	}

}
