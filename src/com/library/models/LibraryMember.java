package com.library.models;

public abstract class LibraryMember {
    private final String memberId;
    private final String name;
    private final String email;

    public LibraryMember(String memberId, String name, String email) {
        if (memberId == null || memberId.isBlank()) {
            throw new IllegalArgumentException("Member ID cannot be null or empty");
        }
        this.memberId = memberId;

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Member name cannot be null or empty");
        }
        this.name = name;

        if (email != null && email.isBlank()) {
            throw new IllegalArgumentException("Member email cannot be null or empty");
        }
        this.email = email;
    }

    // Concrete methods (same for all subclasses)
    public String getMemberId() {
        return memberId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    // Abstract methods (different for each subclass)
    public abstract int getBorrowingLimit();
    public abstract int getLoanPeriodDays();
}
