import java.util.ArrayList;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> dataSource = new ArrayList<>();

        dataSource.add("this");
        dataSource.add("is");
        dataSource.add("a");
        dataSource.add("test");
        dataSource.add("it");
        dataSource.add("is");
        dataSource.add("only");
        dataSource.add("a");
        dataSource.add("test");
        dataSource.add("YIPPEE");

        long count = dataSource.stream() // create a stream
                .distinct() // intermediate operation
                .filter( word -> word.length() >= 4) // intermediate operation
                .count(); // terminal operation

        System.out.println(String.format("Collection as %d distinct words of 4 or more characters.", count));
    }
}
