package ai.testweb.test;

public enum GenderImp implements GenderDesc {
	MALE("ÄÐ"){
		public void info(){
			System.out.println("boy");
		}
	},
	FEMALE("Å®"){
		public void info(){
			System.out.println("gile.");
		}
	};
	
	private final String name;
	public String getName() {
		return name;
	}
	private GenderImp(String name){
		this.name=name;
	}
}
