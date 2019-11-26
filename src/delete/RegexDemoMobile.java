/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 20-Nov-19
 *  Time: 4:10 PM
 */
package delete;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemoMobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String regex = "((\\+91|0)?[6-9]\\d{9})";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        ArrayList<String> mobile = new ArrayList<>();
        while (m.find()){
            String obj = m.group();

            mobile.add(obj);
        }
        for (String s : mobile){
            System.out.println(s);
        }
    }
}
