package ai.testweb.test;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1=Singleton.getSingletnInstance();
		Singleton s2=Singleton.getSingletnInstance();
		System.out.println(s1==s2);
	}
}
