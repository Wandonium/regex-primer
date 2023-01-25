import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("trivialMatcher result: " + trivialMatcher());
        System.out.println("numberMatcher result: " + numberMatcher());
    }

    public static boolean trivialMatcher() {
        // pattern to look for in input string
        Pattern pattern = Pattern.compile("hello");

        // input string to look for pattern in
        Matcher matcher = pattern.matcher("hello");

        // return boolean value; true if pattern matches; false otherwise
        return matcher.find();
    }

    public static boolean numberMatcher() {
        Pattern pattern = Pattern.compile("agent \\d\\d\\d");
        Matcher matcher = pattern.matcher("agent 007");
        return matcher.find();
    }
}