public class Main {
    @FunctionalInterface
    interface  Converter<T, R> {
        R apply(T source);
    }

    public static void main(String[] args) {
        // Convert string values to Boolean
        /* Omitted parentheses, curly braces, return statement because it's a single parameter lambda */
        Converter<String, Boolean> str2Bool = s -> Boolean.parseBoolean(s);

        System.out.println(str2Bool.apply("TRUE"));
        System.out.println(str2Bool.apply("tRuE"));
        System.out.println(str2Bool.apply("faLSE"));
        System.out.println(str2Bool.apply("No"));
        System.out.println(str2Bool.apply(null));

        // Convert Boolean values to Integers
        Converter<Boolean, Integer> bool2Int = b -> b ? 1 : 0;
        System.out.println(bool2Int.apply(true));
    }
}
