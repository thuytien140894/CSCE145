package lab22;

public class ThreadPractice {
	public static void main (String[] args) throws InterruptedException{
		Runnable r0 = new MyThread();
		Thread t0 = new Thread(r0);
		System.out.println("My state before start() is " + t0.getState());
		t0.setName("my lucky thread");
		t0.setPriority(Thread.MAX_PRIORITY);
		t0.start();
		Thread.sleep(1000); //1 second
		System.out.println("My state after start() is " + t0.getState());
		Thread.sleep(5000);
		System.out.println("My state is "  +t0.getState());
		
	}

}
class MyThread implements Runnable{
	private String arg;
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println("Hi, my name is " + t.getName() + ", my id is " + t.getId() + ", my priority is "
				+ t.getPriority());
		try{
			Thread.sleep(5000); //sleep for 5 seconds
			System.out.println("finish");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
