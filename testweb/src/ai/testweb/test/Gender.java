package ai.testweb.test;

public enum Gender {
	MALE,FEMALE;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		switch (this) {
		case MALE:
			if (name.equals("��")) {
				this.name = name;
			}else {
				System.out.println("��������");
			}
			break;
		case FEMALE:
			if(name.equals("Ů")){
				this.name=name;
			}else {
				System.out.println("��������");
			}
			break;
		default:
			System.out.println("��������");
			break;
		}
	}
	
}
