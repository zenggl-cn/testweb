package ai.testweb.test;

public enum GenderImp implements GenderDesc {
	MALE("��"){
		public void info(){
			System.out.println("boy");
		}
	},
	FEMALE("Ů"){
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
