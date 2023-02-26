import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternProblems {

    public static void main(String[] args) {
        //matchingAnyCharacter();
        matchingSpecificCharacters();
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

    public static void matchingSpecificCharacters() {
        // Using brackets [] to match specific characters
        // e.g [abc] matches only a, b or c in a single character
        String input = "\ncan\nman\nfan\ndan\nran\npan";
        // The problem is to match the first three words/strings in
        // the above input while skipping the last three words/strings.
        // Ref: https://regexone.com/lesson/matching_characters?
        Pattern pattern1 = Pattern.compile("[cmf]..");
        Pattern pattern2 = Pattern.compile("[cmf][a][n]");
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        int count1 = 0, count2 = 0;
        while(matcher1.find()) {
            count1++;
            System.out.println("Pattern1 matched string: " + matcher1.group());
        }
        while(matcher2.find()) {
            count2++;
            System.out.println("Pattern2 matched string: " + matcher2.group());
        }

        System.out.println("Input string: " + input);
        System.out.println("No. of matches for pattern1: " + count1);
        System.out.println("No. of matches for pattern2: " + count2);

        // We can also skip the last three strings/words by using
        // the ^ (hat) character to exclude certain letters in the
        // first character in a string/word.
        // Ref: https://regexone.com/lesson/excluding_characters?
        Pattern pattern3 = Pattern.compile("[^drp][a][n]");
        Matcher matcher3 = pattern3.matcher(input);
        int count3 = 0;
        while(matcher3.find()) {
            count3++;
            System.out.println("Pattern3 matched string: " + matcher3.group());
        }
        System.out.println("No. of matches for pattern3: " + count3);
    }
}
