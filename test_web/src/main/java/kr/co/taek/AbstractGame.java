package kr.co.taek;

public class AbstractGame implements Game {

	@Override
	public void move() {
		System.out.println("��������Ʈ�� �����̴�");
	}

	@Override
	public void stop() {
		System.out.println("��������Ʈ�� ���ߴ�");
	}

	@Override
	public void fly() {
		System.out.println("��������Ʈ�� ����");
	}

}
