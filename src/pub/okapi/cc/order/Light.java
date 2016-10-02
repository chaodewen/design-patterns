package pub.okapi.cc.order;

public class Light {
	String name;
	public Light(String name) {
		super();
		this.name = name;
	}
	void on() {
		System.out.println(name + " is on!");
	}
	void off() {
		System.out.println(name + " is off!");
	}
}