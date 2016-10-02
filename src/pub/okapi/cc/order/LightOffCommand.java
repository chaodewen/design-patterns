package pub.okapi.cc.order;

public class LightOffCommand implements Command {
	Light light;
	public LightOffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();
	}
	@Override
	public void undo() {
		this.light.on();
	}
}