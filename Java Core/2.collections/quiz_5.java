import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Queue<Integer> queue = new PriorityQueue<>();
	    
	    queue.add(1);
	    queue.add(2);
	    queue.add(3);
	    
	    int polledElement = queue.poll();
	    
	    System.out.println(polledElement);
	    
	    int peekedElement = queue.peek();
	    
	    System.out.println(peekedElement);
	    
	    System.out.println(queue.size());
	    
	}
	
}
