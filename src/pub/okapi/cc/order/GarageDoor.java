package pub.okapi.cc.order;

public class GarageDoor {
	String name;
	public GarageDoor(String name) {
		super();
		this.name = name;
	}
	void up() {
		System.out.println(name + " is up!");
	}
	void down() {
		System.out.println(name + " is down!");
	}
	void stop() {
		System.out.println(name + " is stopped!");
	}
	void lighOn() {
		System.out.println(name + " is on light!");
	}
	void lightOff() {
		System.out.println(name + " is off light!");
	}
}