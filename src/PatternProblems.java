import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternProblems {

    public static void main(String[] args) {
        matchingAnyCharacter();
    }

    public static void matchingAnyCharacter() {
        // Using the dot to match any character in a string
        // and using the \. to match the period character
        String input = "\ncat.\n896.\n?=+.\nabc1";
        // The problem is to match the first three strings in
        // the above input while skipping the last string. We
        // also need to match all the characters including the
        // period character in the first three strings.
        // Ref: https://regexone.com/lesson/wildcards_dot?
        Pattern pattern = Pattern.compile(".{3}\\.");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while(matcher.find()) count++;

        System.out.println("Input string: " + input);
        System.out.println("No. of matches: " + count);

    }
}
