package ai.testweb.test;

public class Singleton {
	private static Singleton instance;
	
	private Singleton(){	}
	public static Singleton getSingletnInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
	
}
