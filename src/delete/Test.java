/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 16-Nov-19
 *  Time: 3:30 PM
 */
package delete;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {


        final String regex = "([a-zA-Z]+[ ]?)+";
        final String string = "vaibhav1123 Diwan";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(matcher.groupCount());

        while (matcher.find()) {
            System.out.println(matcher.groupCount());
            System.out.println("Full match: " + matcher.group());


        }
        System.out.println(matcher.groupCount());
        System.out.println(Pattern.matches(regex,string));
            }
}