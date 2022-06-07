public class Quiz {
	public static void main(String[] args) throws InterruptedException {
		CommonResource commonResource = new CommonResource();
		for (int i = 0; i < 100; i++) {
		  Thread thread = new Thread(new Runner(commonResource));
		  thread.start();
		}
		try {
		    Thread.sleep(1000);
		    System.out.println(commonResource.get());
		} catch (InterruptedException e) {
		    // NOP
		}
		
	}
}

class Runner implements Runnable {
    
    private CommonResource commonResource;
    
    public Runner(CommonResource commonResource) {
        this.commonResource = commonResource;
    }
    
    @Override
    public void run() {
        commonResource.increment();
    }
}

class CommonResource {
    
    private volatile int x = 0;
    
    public void increment() {
        x++;
    }
    
    public int get() {
        return x;
    }
}
