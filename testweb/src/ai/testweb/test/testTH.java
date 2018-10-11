package ai.testweb.test;

public class testTH {

	public static void main(String[] args) {
		Integer th = 0;
		//MyThread myThread = new MyThread();
		//myThread.run();

		while (true) {
			new MyThread().run();
			th++;
			System.out.println("tt");
		}
	}

}

class MyThread {

	public void run() {

		while (true) {

			System.out.println("MyThread类的run()方法在运行");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
