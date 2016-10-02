package pub.okapi.cc.observer.official;

@SuppressWarnings("unused")
public class WeatherStation {
	public static void main(String[] args) {
		// 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
		// 这个主题对象在状态上发生变化时，会通知所有观察者对象，让它们能够自动更新自己。
		// 系统自带的观察者模式Observable是一个类而不是接口，限制了它的使用和重复
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(88, 65, 30.4f);
		weatherData.setMeasurements(87, 70, 29.2f);
		weatherData.setMeasurements(86, 90, 29.2f);
	}
}