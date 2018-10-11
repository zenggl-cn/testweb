package ai.testweb.test;

public class Address {
	private final String detail;
	private final String postcode;
	public Address(){
		detail="";
		postcode="";
	}
	public Address(String detail,String postcode){
		this.detail=detail;
		this.postcode=postcode;
	}
	public String getDetail() {
		return detail;
	}
	public String getPostcode() {
		return postcode;
	}
	
}
