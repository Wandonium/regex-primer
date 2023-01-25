import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // pattern to look for in input string
        Pattern pattern = Pattern.compile("hello");

        // input string to look for pattern in
        Matcher matcher = pattern.matcher("hell1o");

        boolean found = matcher.find();
        System.out.println("found: " + found);
    }
}