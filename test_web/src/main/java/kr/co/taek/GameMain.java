package kr.co.taek;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class GameMain {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("di.xml");
		
		GalageGame game = (GalageGame)factory.getBean("game");
		game.move();
		game.fly();
		game.stop();
		game.remove();
	}

}
