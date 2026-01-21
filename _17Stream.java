import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Stream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "Apple", "orange", "banana");

        List<String> result = strings.stream()
                                     .map(String::toUpperCase)
                                     .distinct()
                                     .sorted()
                                     .collect(Collectors.toList());

        System.out.println(result);
    }
}
