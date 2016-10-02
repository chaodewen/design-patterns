package pub.okapi.cc.order;

public interface Command {
	public void execute();
	public void undo();
}