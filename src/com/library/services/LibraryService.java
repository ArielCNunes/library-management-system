package com.library.services;

import com.library.interfaces.Borrowable;
import com.library.interfaces.Searchable;
import com.library.models.Book;
import com.library.models.LibraryMember;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryService implements Borrowable, Searchable {
    // Private instances of members and books
    private List<LibraryMember> members;
    private List<Book> books;

    // Private instance of which books are borrowed by which members
    private Map<Book, LibraryMember> borrowedBooks;

    public LibraryService() {
        this.members = new ArrayList<>();
        this.books = new ArrayList<>();
        this.borrowedBooks = new HashMap<>();
    }

    // Add books and members
    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    // Interface methods
    @Override
    public boolean canBorrow(LibraryMember member, Book book) {
        // Check
        if (borrowedBooks.containsKey(book)) {
            return false; // Someone else has it
        }

        // Check 2
        if (!members.contains(member)) {
            return false; // member not in the system
        }

        // Check 3
        // How many books does this member currently have?
        long currentBorrowedCount = borrowedBooks.values().stream()
                .filter(borrower -> borrower.equals(member))
                .count();
        if (currentBorrowedCount >= member.getBorrowingLimit()) {
            return false;
        }

        return true;

    }

    @Override
    public void borrowBook(LibraryMember member, Book book) {

    }

    @Override
    public void returnBook(LibraryMember member, Book book) {

    }

    @Override
    public List<Book> searchByTitle(String title) {
        return books.stream() // Convert list to stream
                .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase())) // Keep only items that match condition
                .collect(Collectors.toList()); // Convert back to list
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> searchByGenre(String genre) {
        return books.stream()
                .filter(book -> book.getGenre() != null &&
                        book.getGenre().toLowerCase().contains(genre.toLowerCase()))
                .collect(Collectors.toList());
    }
}
