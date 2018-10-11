package ai.testweb.test;

public enum Meal {
	APPETIZER(Food.Appetizer.class),
	  MAINCOURSE(Food.MainCourse.class),
	  DESSERT(Food.Dessert.class),
	  COFFEE(Food.Coffee.class);
	  private Food[] values;
	  private Meal(Class<? extends Food> kind) {
	    //ͨ��class�����ȡö��ʵ��
	    values = kind.getEnumConstants();
	  }
	  
	  public Food[] getValues() {
		return values;
	  }

	public interface Food {
	    enum Appetizer implements Food {
	      SALAD, SOUP, SPRING_ROLLS;
	    }
	    enum MainCourse implements Food {
	      LASAGNE, BURRITO, PAD_THAI,
	      LENTILS, HUMMOUS, VINDALOO;
	    }
	    enum Dessert implements Food {
	      TIRAMISU, GELATO, BLACK_FOREST_CAKE,
	      FRUIT, CREME_CARAMEL;
	    }
	    enum Coffee implements Food {
	      BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
	      LATTE, CAPPUCCINO, TEA, HERB_TEA;
	    }
	  }
}
