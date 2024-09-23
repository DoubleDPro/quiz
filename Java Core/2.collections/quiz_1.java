import java.util.*;

public class Quiz {

    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("one");
      list.add("two");
      list.add("two");
      list.add("three");
      Set<String> set = new HashSet<>(list);
      System.out.println(set.size());
    }
}
