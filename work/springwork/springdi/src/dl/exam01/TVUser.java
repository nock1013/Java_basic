package dl.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dl.exam01.TV;

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
