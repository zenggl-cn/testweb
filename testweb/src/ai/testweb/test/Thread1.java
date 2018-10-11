package ai.testweb.test;


class Thread1 extends Thread{
	private String name;
	int count=0;
    public Thread1(String name) {
       this.name=name;
    }
	public void run() {
        while (true) {
        	count+=1;
        	System.out.println(name + "运行  :  " + count);
		}
       
	}
}
