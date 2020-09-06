import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachExample {
    public static void main(String[] args) {
        String[][] quotes = new String[][]{
                {"Hamlet Act 3 Scene 1", "To be, or not, to be"},
                {"Romeo and Juliet Act 2 Scene 2", "Romeo, Romeo! Wherefore art thou, Romeo?"},
                {"Richard III Act 1 Scene 1", "Now is the winter of our discontent"},
                {"Henry IV Pt 2 Act 3 Scene 2", "A man can die but once"},
                {"The Merchant of Venice Act 2 Scene 7", "All that glitters is not gold"}
        };

        for (String[] q : quotes
        ) {
            if (q[0].contains("Hamlet")) {
                System.out.println(String.format("%s: %s", quotes[1], quotes[2]));
            }
        }

        System.out.println("\nUsing Streams\n");
        Stream.of(quotes)
                .filter(q -> q[0].contains("Hamlet"))
                .distinct() // remove duplicates
                .sorted((q1, q2) -> q1[2].compareTo(q2[2])) // sort
                .forEach(q -> {
                    System.out.println(String.format("%s: %s", q[0], q[1]));
                });


        /* Ways of traversing through a list */
        for (String[] q: quotes
             ) {
            System.out.println(String.format("%s: %s", quotes[1], quotes[2]));
        }

        List<String[]> qList = Arrays.asList(quotes);
        qList.forEach(q -> {
            System.out.println(String.format("%s: %s", quotes[1], quotes[2]));
        });

        Stream.of(quotes)
                .forEach(q -> {
                    System.out.println(String.format("%s: %s", quotes[1], quotes[2]));
                });
    }
}
