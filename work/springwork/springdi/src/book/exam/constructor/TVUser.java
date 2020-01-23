package book.exam.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import book.exam.constructor.TV;

public class TVUser {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		TV tv = factory.getBean("tv",TV.class);
		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		
	}

}
