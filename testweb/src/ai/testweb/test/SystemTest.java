package ai.testweb.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;



public class SystemTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Map<String,String> env= System.getenv();
		System.getenv();
		FileOutputStream fileOutputStream=new FileOutputStream("env.ext");
		for (String key : env.keySet()) {
			String str=key+"---->>>"+env.get(key)+"\n";
			System.out.print(str);
			fileOutputStream.write(str.getBytes());
		}
		fileOutputStream.flush();
		fileOutputStream.close();
		System.out.println(System.getenv("JAVA_HOME"));
		
		Properties prot=System.getProperties();
		prot.store(new FileOutputStream("prot.txt"), "System Properties");
		System.out.println(System.getProperty("os.name"));
		for (String str : prot.stringPropertyNames()) {
			String prot_str=str+"="+prot.getProperty(str);
			System.out.println(prot_str);
		}
	}

}
