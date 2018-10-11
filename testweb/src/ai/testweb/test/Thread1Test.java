package ai.testweb.test;

public class Thread1Test {

	public static void main(String[] args) {
//		Thread1 mTh1=new Thread1("A");
//		Thread1 mTh2=new Thread1("B");
//		mTh1.start();
//		mTh2.start();
		int count=0;
		while(true){
			new Thread1("A"+count).start();
			count+=1;
		}
	}
}
