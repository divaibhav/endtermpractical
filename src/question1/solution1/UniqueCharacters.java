/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 07-Nov-19
 *  Time: 10:15 AM
 */
package question1.solution1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UniqueCharacters {

    public static void main(String[] args) {
//        Set<Character> nameSet = new HashSet<>();
//        String myName = "vaibhav";
//        for (int i = 0; i < myName.length() ; i++) {
//
//
//            nameSet.add(myName.charAt(i));
//        }
//        System.out.println(nameSet.size());
//
//        Name obj1 = new Name("Vaibhav", "Diwan");
//        Name obj2 = new Name("Vaibhav", "Diwan");
//        HashSet<Name> test = new HashSet<>();
//        test.add(obj1);
//        test.add(obj2);
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//        System.out.println(test);
            HashSet<Character> set = new HashSet<>();


    }
}
class Name{
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object newName) {
        if (this == newName){
            return true;
        }
        else if(newName instanceof Name){
            Name obj = (Name) newName;
            return firstName.equals(obj.firstName) && lastName.equals(obj.lastName);
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }
}
