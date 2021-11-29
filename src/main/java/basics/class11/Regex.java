package basics.class11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //match one String against one regex
        System.out.println(Pattern.matches("([.w]){2}f", "..f"));
        System.out.println(Pattern.matches("[k*]a*b", "kaaaaabx"));

        //using a Matcher object to find matching substrings
        Pattern p = Pattern.compile("CSC[0-9][0-9][0-9]H1([FS])");
        Matcher matcher = p.matcher("CSC207H1S");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        //using the String method "matches" to check if a String matches a regex
        String str = "Hello_World11";
        boolean isSame = str.matches("(Hello)\\w.*(1)\\2");
        System.out.println(isSame);
    }
}
