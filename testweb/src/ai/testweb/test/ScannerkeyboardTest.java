package ai.testweb.test;

import java.util.Scanner;

public class ScannerkeyboardTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			
			String str=sc.next();
			if(str.equalsIgnoreCase("exit")){
				break;
			}else {
				System.out.println("out put:"+str);
			}
		}
	}

}
