import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMapExample {
    public static void main(String[] args) {
        Stream<String[]> stream = Stream.of(new String[][]{
                {"Hamlet Act 3 Scene 1", "To be, or not, to be"},
                {"Romeo and Juliet Act 2 Scene 2", "Romeo, Romeo! Wherefore art thou, Romeo?"},
                {"Richard III Act 1 Scene 1", "Now is the winter of our discontent"},
                {"Henry IV Pt 2 Act 3 Scene 2", "A man can die but once"},
                {"The Merchant of Venice Act 2 Scene 7", "All that glitters is not gold"}
        });

        Map<String, String> asMap = stream
                .peek(q -> System.out.println(String.format("%s: '%s'", q[0], q[1])))
                .collect(Collectors.toMap(
                        q -> q[0], // KeyMapper: how to derive the Map Entry's Key
                        q -> q[1] // ValueMapper: how to derive the Map Entry's Value
                ));
        System.out.println(asMap.keySet());
        System.out.println(asMap.values());

        System.out.println(asMap.get("Henry IV Pt 2 Act 3 Scene 2"));
    }
}
