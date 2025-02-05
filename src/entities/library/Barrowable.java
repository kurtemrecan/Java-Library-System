package entities.library;

import entities.book.Book;

public interface Barrowable {

    //iade ve ödünç alınabilir kitaplar için interfaace yaptık

    public abstract void borrowBook(Book book);
    void returnBook(Book book);
}
