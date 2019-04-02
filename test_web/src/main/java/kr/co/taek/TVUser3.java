package kr.co.taek;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser3 {
	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("di.xml");
		
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
		
		factory.close();
		
		
	}

}
