package com.library;

import com.library.models.*;
import com.library.services.LibraryService;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create library service
        LibraryService library = new LibraryService();

        // Add books
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch",
                LocalDate.of(2017, 12, 27), "Programming");
        Book book2 = new Book("978-0135166307", "Clean Code", "Robert Martin",
                LocalDate.of(2008, 8, 1), "Programming");

        library.addBook(book1);
        library.addBook(book2);

        // Add members
        LibraryMember student = new Student("S001", "Alice", "alice@email.com");
        LibraryMember faculty = new Faculty("F001", "Dr. Smith", "smith@email.com");

        library.addMember(student);
        library.addMember(faculty);

        // Test borrowing
        library.borrowBook(student, book1);
        library.borrowBook(faculty, book2);

        // Test search
        System.out.println("Java books: " + library.searchByTitle("Java").size());

        // Test return
        library.returnBook(student, book1);
    }
}