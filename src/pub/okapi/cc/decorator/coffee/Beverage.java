package pub.okapi.cc.decorator.coffee;

public abstract class Beverage {
	// 饮料
	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}