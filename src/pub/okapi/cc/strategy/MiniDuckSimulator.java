package pub.okapi.cc.strategy;

public class MiniDuckSimulator {
	// 策略模式定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。
	// 策略模式让算法独立于使用它的客户而独立变化。
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.display();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFly(new FlyRocketPowered());
		model.performFly();
	}
}