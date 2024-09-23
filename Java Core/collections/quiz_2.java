import java.util.*;

public class Quiz {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        System.out.print(map.get("two"));
        
        map.put("two", 4);
        
        System.out.print(map.get("two"));
        
        System.out.print(map.get("four"));
      
    }
}
