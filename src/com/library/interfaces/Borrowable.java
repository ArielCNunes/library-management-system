package com.library.interfaces;

import com.library.models.Book;
import com.library.models.LibraryMember;

import java.util.List;

public interface Borrowable {
    boolean canBorrow(LibraryMember member, Book book);
    void borrowBook(LibraryMember member, Book book);
    void returnBook(LibraryMember member, Book book);
}
