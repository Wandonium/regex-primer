import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingStrings {

    // To extract strings from the input string
    // first group the string to extract in the
    // pattern using () e.g
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a|A]gent (\\d{3,4})$");
        Matcher matcher = pattern.matcher("agent 007");

        if(matcher.find()) {
            System.out.println("Group: " + matcher.group());
            System.out.println("First Group: " + matcher.group(1));
        }
    }
}
