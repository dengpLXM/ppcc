package listener.impl;

import listener.IEvent;
import listener.IEventListener;

public class Test {

	 public static void main(String[] args) {  
	        // �¼�Դ���������Ķ���  
	        EventSource m1 = new EventSource();  
	        // ������  
	        IEventListener mEventListener = new IEventListener() {  
	        	

				@Override
				public void doEvent(IEvent arg) {
					if (arg.ClickBtn() == true) {
						 System.out.println("�����˰�ť");  
					}
					
				}  
	        };  
	        // ע����������¼�Դ  
	        m1.setEventListener(mEventListener);
	        m1.clickBtnHappened();
	    }  
}
