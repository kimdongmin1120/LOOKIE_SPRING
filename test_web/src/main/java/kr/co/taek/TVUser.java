package kr.co.taek;

public class TVUser {
	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		LEDTV tv2 = new LEDTV();
		tv2.powerOn();
		tv2.powerOff();
	}

}
