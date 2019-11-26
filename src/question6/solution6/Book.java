/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 14-Nov-19
 *  Time: 11:32 AM
 */
package question6.solution6;

import java.util.Objects;

//custom class or user defined class
public class Book {
    //fields
    private long isbn;
    private String bookName;
    private String author;
    @Override
    public int hashCode(){
        return Objects.hash(isbn,bookName,author);

    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Book)) {
            return false;
        }
        Book obj = (Book)o;
        if(isbn == obj.isbn && bookName.equals(obj.bookName) &&
                author.equals(obj.author)){
            return true;
        }
        else{
            return false;
        }
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "isbn=" + isbn +
//                ", bookName='" + bookName + '\'' +
//                ", author='" + author + '\'' +
//                '}';
//    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
