/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 10-Nov-19
 *  Time: 12:20 AM
 */
package delete;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Separate {
    public static void main(String[] args) {
//        String test = "9754435581";
//        String regex = "";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(test);
//        System.out.println(matcher.group());

        String text = "vaibhav";
        String regex = "[^ia]";
        String[] arr = text.split(regex);
        System.out.println(Arrays.toString(arr));
        //System.out.println("my web link is http//:www.ex.com".matches("^[http]+."));




    }
}
