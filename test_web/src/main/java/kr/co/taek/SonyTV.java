package kr.co.taek;

public class SonyTV implements TV{
	public void powerOn() {
		System.out.println("��� Turn on");
	}
	public void powerOff() {
		System.out.println("��� Turn off");
	}
	public void volumeUp() {
		System.out.println("��� volume up");
	}
	public void volumeDown() {
		System.out.println("��� volume down");
	}
}
