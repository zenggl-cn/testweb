package ai.testweb.test;

import java.util.Arrays;

import ai.testweb.test.Meal.Food;

public class EnumTest {
	
	public void judge(SeasonEnum season){
		switch (season) {
		case Spring:
			System.out.println(SeasonEnum.Spring);
			break;
		case Winter:
			System.out.println(SeasonEnum.Winter);
			break;
		default:
			System.out.println("Season.....");
			break;
		}
	}
	public static void main(String[] args) {
		for (SeasonEnum season : SeasonEnum.values()) {
			System.out.println(season);
		}
		new EnumTest().judge(SeasonEnum.Spring);
		new EnumTest().judge(SeasonEnum.Autumn);
		
		Meal m=Meal.COFFEE;
		Food[] ff=m.getValues();
		System.out.println(Arrays.toString(ff));
		//System.out.println(Food.Coffee.BLACK_COFFEE);
		double ss=Operator_abs.PLUS.eval(2, 3);
		System.out.println(ss);
	}

}
