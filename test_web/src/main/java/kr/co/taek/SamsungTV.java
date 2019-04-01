package kr.co.taek;

public class SamsungTV implements TV{
	public void powerOn() {
		System.out.println("伙己 Turn on");
	}
	public void powerOff() {
		System.out.println("伙己 Turn off");
	}
	public void volumeUp() {
		System.out.println("伙己 volume up");
	}
	public void volumeDown() {
		System.out.println("伙己 volume down");
	}
}
