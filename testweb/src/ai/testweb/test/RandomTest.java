package ai.testweb.test;

import java.util.concurrent.ThreadLocalRandom;

import com.sun.org.apache.xpath.internal.operations.Lt;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocalRandom tlr= ThreadLocalRandom.current();
		ThreadLocalRandom tlr2= ThreadLocalRandom.current();
		System.out.println(tlr.nextInt());
		System.out.println(tlr2.nextInt());
	}

}
