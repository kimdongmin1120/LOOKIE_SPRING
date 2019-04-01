package kr.co.taek;

public class AbstractGame implements Game {

	@Override
	public void move() {
		System.out.println("스프라이트가 움직이다");
	}

	@Override
	public void stop() {
		System.out.println("스프라이트가 멈추다");
	}

	@Override
	public void fly() {
		System.out.println("스프라이트가 날다");
	}

}
