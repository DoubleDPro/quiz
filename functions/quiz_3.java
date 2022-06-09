import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Quiz {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "22", "333");
        forEach(strings, (String x) -> System.out.print(x.length() + " "));
        System.out.println();
        List<Integer> integers = strings.stream().map(Integer::parseInt).collect(Collectors.toList());
        forEach(integers, (Integer i) -> System.out.print(i + " "));

    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
