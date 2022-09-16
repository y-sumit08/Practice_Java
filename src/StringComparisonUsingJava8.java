import java.util.Arrays;

public class StringComparisonUsingJava8 {
    public static void main(String[] args) {
        String str = "Mumbai";
        boolean result = Arrays.asList("Pune", "Mumbai").stream().anyMatch(s -> s.equalsIgnoreCase(str));
        System.out.println(result);
    }
}
