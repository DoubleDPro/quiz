import java.util.*;

public class Main {
  
	public static void main(String[] args) {
	    Map<String, Integer> map = new TreeMap<>();
	    
	    map.put("odin", 3);
	    map.put("dva", 2);
	    map.put("tri", 1);
	    
	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
	        System.out.print(entry.getKey() + " ");
	    }
	    
	}
	
}
