import java.util.*;

public class Quiz {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(5);
        set.add(4);
        
        for (int el : set) {
            System.out.print(el + " ");
        }
      
    }
}
