package pub.okapi.cc.order;

public class CeilingFanMediumCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.speed;
		ceilingFan.medium();
	}

	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		}
		else if(prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		}
		else if(prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		}
		else if(prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
