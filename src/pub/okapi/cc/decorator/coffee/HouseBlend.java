package pub.okapi.cc.decorator.coffee;

public class HouseBlend extends Beverage {
	// 星巴克咖啡
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}
}
