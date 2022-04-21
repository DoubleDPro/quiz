import java.util.function.Function;

public class Quiz {
    
    private static final String LINE = "Developer";

    public static void main(String[] args) {
        Function<String, Integer> firstFunction = String::length;
        
        System.out.println(method(firstFunction));
    }
    
    private static int method(Function<String, Integer> function) {
        return function.apply(LINE);
    }
    
}
