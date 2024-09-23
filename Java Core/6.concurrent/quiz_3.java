public class Quiz {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runner());
		thread.start();
		try {
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		   // NOP 
		}
		thread.interrupt();
		System.out.println("End!");
	}
}

class Runner implements Runnable {
    
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000);
                System.out.println("Live!");
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
            
        }
    }
}
