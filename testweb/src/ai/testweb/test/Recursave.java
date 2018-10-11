package ai.testweb.test;

public class Recursave {
	
	public static int fn(int n){
		if(n==1){
			return 1;
		}else{
			return fn(n-1)+n;
		}
	}
	public static void main(String[] args) {
		int n=100;
		n=fn(n);
		System.out.println(n);
	}
}
