/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 16-Nov-19
 *  Time: 11:21 AM
 */
package question6.solution6.soultionsecond;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//custom set implementation
public class MyHashSet {
    public static void main(String[] args) {
        Set<Book> bookSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2 ; i++) {
            long isbn = sc.nextLong();
            sc.nextLine();
            String bookName = sc.nextLine();
            String authorName = sc.nextLine();
            Book b = new Book(isbn,bookName,authorName);
            boolean result = bookSet.add(b);
            System.out.println(result);
        }
        //System.out.println(bookSet);
        for (Book b : bookSet){
            System.out.println(b.hashCode());
        }
    }
}
