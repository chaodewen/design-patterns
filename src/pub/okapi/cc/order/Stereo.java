package pub.okapi.cc.order;

public class Stereo {
	String name;
	int volume = 5;
	public Stereo(String name) {
		super();
		this.name = name;
	}
	void on () {
		System.out.println(name + " is on!");
	}
	void off () {
		System.out.println(name + " is off!");
	}
	void setCd () {
		System.out.println(name + " is CD mode!");
	}
	void setDvd () {
		System.out.println(name + " is DVD mode!");
	}
	void setVolume (int volume) {
		this.volume = volume;
		System.out.println("Volume of " + name + " has been set " + volume + ".");
	}
}