package com.library.models;

public class Faculty extends LibraryMember {
    public Faculty(String memberId, String name, String email) {
        super(memberId, name, email);
    }

    @Override
    public int getBorrowingLimit() {
        return 10;
    }

    @Override
    public int getLoanPeriodDays() {
        return 28;
    }
}
