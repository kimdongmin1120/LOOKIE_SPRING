package kr.co.taek;

public class LEDTV implements TV {
	public void powerOn() {
		System.out.println("LED TV turn on");
	}

	public void powerOff() {
		System.out.println("LED TV turn off");
	}

	public void volumeUp() {
		System.out.println("LED TV �Ҹ� ��");
	}

	public void volumeDown() {
		System.out.println("LED TV �Ҹ� �ٿ�");
	}

}
