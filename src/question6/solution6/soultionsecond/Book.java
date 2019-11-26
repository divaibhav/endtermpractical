/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 16-Nov-19
 *  Time: 11:17 AM
 */
package question6.solution6.soultionsecond;

import java.util.Objects;

//custom class or user defined class
public class Book {
    private long isbn;
    private String bookName;
    private String authorName;

    public Book(long isbn, String bookName, String authorName) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.authorName = authorName;
    }

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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getIsbn() == book.getIsbn() &&
                Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn(), getBookName(), getAuthorName());
    }
}
