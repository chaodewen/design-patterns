package pub.okapi.cc.abstractfactory;

import pub.okapi.cc.abstractfactory.NYPizzaStore;
import pub.okapi.cc.abstractfactory.Pizza;
import pub.okapi.cc.abstractfactory.PizzaStore;

public class PizzaTestDrive {
	public static void main(String[] args) {
		// 抽象工厂模式提供一个接口，用于创建相关或依赖的家族，而不需要明确指定具体类
		// 抽象工厂模式通常使用工厂方法模式实现
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza pizza = nyPizzaStore.createPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		System.out.println(pizza.toString());
	}
}