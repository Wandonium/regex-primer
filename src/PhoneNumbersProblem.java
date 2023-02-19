import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbersProblem {

    // Problem: matching different Kenyan
    // phone number input configurations
    public static void main(String[] args) {
        String phoneNumbers = "\n+254708072998\n0708072998\n708072998\n01108072998";

        Pattern pattern = Pattern.compile("^([+]2547|07|7|011)\\d{8}$", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(phoneNumbers);
        int count = 0;
        while(matcher.find()) count++;
        System.out.println("Phone Numbers: " + phoneNumbers);
        System.out.println("No. of matches: " + count);
    }
}
