package pub.okapi.cc.strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	Duck() {}
	public abstract void display();
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	public void setFly(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuack(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
