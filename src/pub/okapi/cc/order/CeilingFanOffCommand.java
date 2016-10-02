package pub.okapi.cc.order;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		this.ceilingFan.off();
	}

	@Override
	public void undo() {
		this.ceilingFan.on();
	}
}
