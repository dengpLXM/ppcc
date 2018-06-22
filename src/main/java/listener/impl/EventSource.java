package listener.impl;

import listener.IEvent;
import listener.IEventListener;

public class EventSource implements IEvent{

	private IEventListener IEListener;
	
	boolean btn;
	
	
	@Override
	public boolean ClickBtn() {
		// TODO Auto-generated method stub
		return btn;
	}


	/*
	 * ×¢²á¼àÌıÆ÷
	 * (non-Javadoc)
	 * @see listener.IEvent#setEventListener(listener.IEventListener)
	 */
	@Override
	public void setEventListener(IEventListener arg) {
		IEListener = arg;
	}

	public void clickBtnHappened(){
		btn = true;
		IEListener.doEvent(this);
	}

}
