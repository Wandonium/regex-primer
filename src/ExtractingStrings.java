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
        matchCard();
        replaceCard();
        replaceMath();
    }

    public static void matchCard() {
//        Pattern pattern = Pattern.compile("^\\d{4}-\\d{4}-\\d{4}-\\d{4}$");
        Pattern pattern = Pattern.compile("^(\\d{4}-){3}\\d{4}$");
        Matcher matcher = pattern.matcher("1234-2222-3333-4343");
        System.out.println("Found card number: " + matcher.find());
    }

    public static void replaceCard() {
        // replace card number 1234-2222-3333-4343 with
        // XXXX-XXXX-XXXX-4343
        Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
        Matcher matcher = pattern.matcher("1234-2222-3333-4343");

        String maskedCardNumber = matcher.replaceAll("XXXX-XXXX-XXXX-");
        System.out.println("Masked card num: " + maskedCardNumber);
    }

    public static void replaceMath() {
        // replace math operation such input string
        // 10 divided by 2
        // becomes
        // 10/2
        Pattern pattern = Pattern.compile("(\\d+) divided by (\\d+)");
        Matcher matcher = pattern.matcher("10 divided by 2");

        if(matcher.find()) {
            String simplified = "Operation: " + matcher.replaceFirst("$1/$2");
            // print out math operation
            System.out.println(simplified);
            // get result of math operation
            int result = Integer.valueOf(matcher.group(1)) / Integer.valueOf(matcher.group(2));
            System.out.println("Result: " + result);
        }
    }
}
