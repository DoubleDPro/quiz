import java.util.function.Predicate;

public class Quiz {
    
    private static final String LINE = "Developer";

    public static void main(String[] args) {
        Predicate<String> firstPredicate = s -> s.startsWith("Pro");
        Predicate<String> secondPredicate = s -> s.endsWith("er");
        Predicate<String> thirdPredicate = s -> s.contains("lop");
        
        System.out.println(method(firstPredicate));
        System.out.println(method(secondPredicate));
        System.out.println(method(thirdPredicate));
    }
    
    private static boolean method(Predicate<String> predicate) {
        return predicate.test(LINE);
    }
    
}
