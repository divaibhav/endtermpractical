/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 07-Nov-19
 *  Time: 11:21 AM
 */
package questtion3.soultion3;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String myName = "Vaaaabbbbbhhhhhhavvvvvv".toLowerCase();
        Set<Character> nameCharSet = new HashSet<>();
        Set<Character> dulicateCharSet = new HashSet<>();
        for (int i = 0; i < myName.length(); i++) {
            boolean flag = nameCharSet.add(myName.charAt(i));
            if(!flag){
                dulicateCharSet.add(myName.charAt(i));
            }
        }
        System.out.println("Number unique of characters :\t" + nameCharSet.size());
        System.out.println("Number dupilcate of duplicate characters :\t " + dulicateCharSet.size());
        System.out.println(myName);
        System.out.println();
    }
}
