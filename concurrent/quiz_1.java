public class Quiz {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runner());
		thread.start();
		for (int i = 0; i < 10; i++) {
		    try {
		        Thread.sleep(1000);
		        System.out.println("B");
		    } catch (InterruptedException e) {
		        // NOP
		    }
		    
		}
	}
}

class Runner implements Runnable {
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("A");
            } catch (InterruptedException e) {
                // NOP
            }
        }
    }
}
