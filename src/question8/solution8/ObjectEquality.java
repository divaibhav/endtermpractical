/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Nov-19
 *  Time: 5:24 PM
 */
package question8.solution8;

public class ObjectEquality {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ramesh");
        s1.setRollNo(13);
        s1.setCpi(7.32);

        Student s2 = new Student();
        //comparing s1 and s2 using equals
        boolean result = s1.equals(s2);
        System.out.println(result);
    }
}
