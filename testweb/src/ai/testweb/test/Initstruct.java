package ai.testweb.test;

public class Initstruct {
	{
		System.out.println("1111111111111111");
	}
	public Initstruct(){
		System.out.println("333333333333333333");
	}
	public static void main(String[] args) {
		new Initstruct();
		new Initstruct();
	}
	
	{
		System.out.println("2222222222222222222");
	}
	static{
		System.out.println("4444444444444");
	}
}
