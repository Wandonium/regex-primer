import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("trivialMatcher result: " + trivialMatcher());
        System.out.println("numberMatcher result: " + numberMatcher());
        System.out.println("exactMatcher result: " + exactMatcher());
        System.out.println("rangeMatcher result: " + rangeMatcher());
        System.out.println("caseMatcher result: " + caseMatcher());
        System.out.println("OrMatcher result: " + OrMatcher());
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
        // find numbers in input string
        // Pattern pattern = Pattern.compile("agent \\d\\d\\d");

        // find a given number of digits in input string
        //Pattern pattern = Pattern.compile("agent \\d{3}");
        //Matcher matcher = pattern.matcher("agent 007");

        // find a given range of digits in input string
        Pattern pattern = Pattern.compile("agent \\d{3,4}");

        // will return true
        //Matcher matcher = pattern.matcher("agent 007");

        // will also return true coz no beginning ^ and ending $ characters
        // in pattern string
        Matcher matcher = pattern.matcher("agent 00007");
        return matcher.find();
    }

    public static boolean exactMatcher() {
        // pattern for matching exact string from beginning to end
        // using beginning character ^ and end character $
        Pattern pattern = Pattern.compile("^agent \\d{3,4}$");

        // will return true
        //Matcher matcher = pattern.matcher("agent 007");

        // will return true
        //Matcher matcher = pattern.matcher("agent 0007");

        // will return false
        Matcher matcher = pattern.matcher("agent 00007");

        // return boolean value; true if pattern matches; false otherwise
        return matcher.find();
    }

    public static boolean rangeMatcher() {
        // pattern for matching range of digits in input string
        // matches digits from 0 to 6
        Pattern pattern = Pattern.compile("^agent [0-6]{3,4}$");

        // will return true
        //Matcher matcher = pattern.matcher("agent 005");

        // will return true
        //Matcher matcher = pattern.matcher("agent 0006");

        // will return false
        Matcher matcher = pattern.matcher("agent 007");

        // return boolean value; true if pattern matches; false otherwise
        return matcher.find();
    }

    public static boolean caseMatcher() {
        // pattern for matching both lowercase and uppercase
        // letters
        Pattern pattern = Pattern.compile("^[aA]gent \\d{3,4}$");

        // will return true
        //Matcher matcher = pattern.matcher("agent 005");

        // will return true
        //Matcher matcher = pattern.matcher("Agent 0006");

        // will return false
        Matcher matcher = pattern.matcher("!gent 007");

        // return boolean value; true if pattern matches; false otherwise
        return matcher.find();
    }

    public static boolean OrMatcher() {
        // pattern for matching either one case or the other
        Pattern pattern = Pattern.compile("^(a|A|aa)gent \\d{3,4}$");

        // will return true
        //Matcher matcher = pattern.matcher("agent 005");

        // will return true
        //Matcher matcher = pattern.matcher("Agent 0006");

        // will return true
        //Matcher matcher = pattern.matcher("aagent 0006");

        // will return false
        Matcher matcher = pattern.matcher("!gent 007");

        // return boolean value; true if pattern matches; false otherwise
        return matcher.find();
    }
}