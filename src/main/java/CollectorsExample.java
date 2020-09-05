import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("To", "be", "or", "not", "to", "be");

        System.out.println();
        List<String> asList = stream
                .peek(s -> System.out.print(s + " "))
                .collect(Collectors.toList());

        System.out.println();
        System.out.println(asList);

        // Change stream to a Set
        Set<String> asSet = asList.stream().collect(Collectors.toSet());
        System.out.println(asSet);
    }
}
