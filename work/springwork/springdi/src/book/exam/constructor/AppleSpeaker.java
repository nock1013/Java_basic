package book.exam.constructor;

public class AppleSpeaker implements Speaker {
	 
	public AppleSpeaker() {
		
	}
	@Override
	public void soundUP() {
		System.out.println("애플 업~~~");
	}
	@Override
	public void soundDown() {
		System.out.println("애플 다운~~~");
	}

}
