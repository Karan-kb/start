package arg;

public class Task12 {
	public static void main(String [] args) {
		ThreadClass tc = new ThreadClass();
		Thread th=new Thread(tc);
		th.start();
		
		
		ThreadClass tc1=new ThreadClass();
		
		Thread th1 =new Thread(tc1);
		th1.start();
		
		
	}

}

class ThreadClass implements Runnable{
	
	@Override
	public void run() {
		try {
			for(int i=1; i<=10;i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		
		catch(Exception ex) {
			System.out.println("Exception found.");
		}
	}
	
}