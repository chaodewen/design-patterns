package pub.okapi.cc.observer.unofficial;

public interface Observer extends Subject {
	public void update(float temperature, float humidity, float pressure);
}