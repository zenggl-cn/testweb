package ai.testweb.test;

public class GenderTest {

	public static void main(String[] args) {
		Gender.FEMALE.setName("��");
		Gender.FEMALE.setName("Ů");
		Gender g=Gender.MALE;
		g.setName("��");
		System.out.println(g.getName());
		
		String gender=GenderSimple.MALE.getName();
		System.out.println(gender);
		
		System.out.println(GenderImp.MALE.getName());
		GenderImp.FEMALE.info();
	}

}
