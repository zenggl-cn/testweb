package ai.testweb.test;

public class ReferenceTest {
	
	public static void swap(DataWrap dw){
		int temp=dw.aa;
		dw.aa=dw.bb;
		dw.bb=temp;
		System.out.printf("a=%d,b=%d%n",dw.aa,dw.bb);
	}
	public static void main(String[] args) {
		DataWrap dw=new DataWrap();
		dw.aa=999999;
		dw.bb=888888;
		System.out.printf("a=%d,b=%d%n",dw.aa,dw.bb);
		swap(dw);
		System.out.printf("a=%d,b=%d%n",dw.aa,dw.bb);
	}
}