package ai.testweb.test;

public enum GenderSimple {
	MALE("��"),FEMALE("Ů");
	private final String name;
	public String getName() {
		return name;
	}
	private GenderSimple(String name){
		this.name=name;
	}
	
}
