package pub.okapi.cc.order;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.on();
		this.stereo.off();
		this.stereo.setVolume(11);
	}

	@Override
	public void undo() {
		this.stereo.off();
	}
}