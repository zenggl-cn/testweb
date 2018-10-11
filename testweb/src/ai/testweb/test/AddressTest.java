package ai.testweb.test;

public class AddressTest {

	public static void main(String[] args) {
		Address ad1=new Address("1","111");
		Address ad2=new Address("2","2222");
		ad1=new Address();
		System.out.println(ad1.getDetail());
		System.out.println(ad2.getDetail());
	}

}
