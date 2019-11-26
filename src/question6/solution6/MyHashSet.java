/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 14-Nov-19
 *  Time: 11:31 AM
 */
package question6.solution6;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
        Set<Book> bookSet = new HashSet<>();
        Book b1 = new Book();
        b1.setBookName("abc");
        b1.setIsbn(12345678L);
        b1.setAuthor("Abhi");
        Book b2 = new Book();
        b2.setBookName("abc");
        b2.setIsbn(12345678L);
        b2.setAuthor("Abhi");

        if(bookSet.add(b1)){
            System.out.println("object added successfully");
        }
        else{
            System.out.println("object not added");
        }
        if(bookSet.add(b2)){
            System.out.println("object added successfully");
        }
        else{
            System.out.println("object not added");
        }
        for (Book obj : bookSet){
            System.out.println(obj);
        }
    }
}
