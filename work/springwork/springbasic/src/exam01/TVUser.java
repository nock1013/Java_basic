package exam01;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		
		TV lgtv = new LgTV();
		lgtv.powerOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.powerOff();
	}

}
