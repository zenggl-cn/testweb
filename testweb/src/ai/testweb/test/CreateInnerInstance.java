package ai.testweb.test;


class Out{
 public class In{
		public  In() {
			System.out.println("in");
		}
		public String toString(){
			return "CreateInnerInstance";
		}
	}
}
public class CreateInnerInstance {

	public static void main(String[] args) {
		Out.In in=new Out().new In();
		new Out().new In();
		System.out.println(in.toString());	
	}

}
