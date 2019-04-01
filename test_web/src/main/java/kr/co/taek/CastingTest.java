package kr.co.taek;
import java.lang.*;
import java.util.ArrayList;

public class CastingTest {

	public static void main(String[] args) {
		ArrayList food = new ArrayList();
		food.add("ÇÇÀÚ");
		food.add(1000);
		food.add(1.8);
		
		String s = (String)food.get(0);
		int p = (Integer)food.get(1);
		double d = (Double)food.get(2);
		System.out.println(s);
		System.out.println(p);
		System.out.println(d);
	}

}
