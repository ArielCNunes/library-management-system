package com.library;

import com.library.models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch",
                LocalDate.of(2017, 12, 27), "Programming");

        // Create different member types
        LibraryMember student = new Student("S001", "Alice", "alice@email.com");
        LibraryMember faculty = new Faculty("F001", "Dr. Smith", "smith@email.com");

        // Polymorphism
        System.out.println("Student can borrow: " + student.getBorrowingLimit() + " books");
        System.out.println("Faculty can borrow: " + faculty.getBorrowingLimit() + " books");
    }
}