package pub.okapi.cc.decorator.coffee;

public class Espresso extends Beverage {
	// 浓缩咖啡
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}
}
