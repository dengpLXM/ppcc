package listener.impl;

import listener.IEvent;
import listener.IEventListener;

public class Test {

	 public static void main(String[] args) {  
	        // 事件源（被监听的对象）  
	        EventSource m1 = new EventSource();  
	        // 监听器  
	        IEventListener mEventListener = new IEventListener() {  
	        	

				@Override
				public void doEvent(IEvent arg) {
					if (arg.ClickBtn() == true) {
						 System.out.println("你点击了按钮");  
					}
					
				}  
	        };  
	        // 注册监听器到事件源  
	        m1.setEventListener(mEventListener);
	        m1.clickBtnHappened();
	    }  
}
