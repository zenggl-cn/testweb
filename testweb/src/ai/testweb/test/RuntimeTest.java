package ai.testweb.test;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) throws IOException {
		Runtime rt=Runtime.getRuntime();
		System.out.println(rt.availableProcessors());
		System.out.println(rt.totalMemory());
		rt.exec("notepad.exe");
		rt.exit(0);
	}

}
