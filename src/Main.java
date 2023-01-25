import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("hello");
        Matcher matcher = pattern.matcher("hello");

        boolean found = matcher.find();
        System.out.println("found: " + found);
    }
}