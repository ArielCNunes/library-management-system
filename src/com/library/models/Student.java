package com.library.models;

public class Student extends LibraryMember{
    public Student(String memberId, String name, String email) {
        super(memberId, name, email); // call parent constructor
    }

    @Override
    public int getBorrowingLimit() {
        return 3;
    }

    @Override
    public int getLoanPeriodDays() {
        return 14;
    }
}
