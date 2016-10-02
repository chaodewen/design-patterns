package pub.okapi.cc.order;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;

	public CeilingFan(String location) {
		super();
		this.location = location;
		this.speed = OFF;
	}
	
	void high() {
		this.speed = HIGH;
//		System.out.println(location + " is high!");
	}
	
	void medium() {
		this.speed = MEDIUM;
//		System.out.println(location + " is medium!");
	}
	
	void low() {
		this.speed = LOW;
//		System.out.println(location + " is low!");
	}
	
	void on() {
		System.out.println(location + " is on!");
	}
	
	void off() {
		this.speed = OFF;
//		System.out.println(location + " is off!");
	}
	
	int getSpeed() {
//		System.out.println("Speed of " + location + " is " + speed + ".");
		return speed;
	}
}