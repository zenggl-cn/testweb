package ai.testweb.test;

public class GenderTest {

	public static void main(String[] args) {
		Gender.FEMALE.setName("ÄÐ");
		Gender.FEMALE.setName("Å®");
		Gender g=Gender.MALE;
		g.setName("ÄÐ");
		System.out.println(g.getName());
		
		String gender=GenderSimple.MALE.getName();
		System.out.println(gender);
		
		System.out.println(GenderImp.MALE.getName());
		GenderImp.FEMALE.info();
	}

}
