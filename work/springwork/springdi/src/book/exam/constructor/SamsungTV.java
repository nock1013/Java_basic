package book.exam.constructor;

public class SamsungTV implements TV{
	Speaker speaker;
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void soundUp() {
		System.out.println("SamsungTV---소리 올린다.");
		speaker.soundUP();
	}

	public void soundDown() {
		System.out.println("SamsungTV---소리 내린다.");
		speaker.soundDown();
	}
}
