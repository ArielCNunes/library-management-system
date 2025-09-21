package com.library.models;

import java.time.LocalDate;

public class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private final LocalDate publishDate;
    private String genre;

    public Book(String ISBN, String title, String author, LocalDate publishDate, String genre) {
        if (ISBN == null || ISBN.trim().isEmpty()) {
            throw new IllegalArgumentException("ISBN is null");
        }
        this.isbn = ISBN;

        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("title is null");
        }
        this.title = title;

        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("author is null");
        }
        this.author = author;

        if (publishDate == null) {
            throw new IllegalArgumentException("publishDate is null");
        }
        this.publishDate = publishDate;

        this.genre = genre;
    }

    // Getters for final fields
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public LocalDate getPublishDate() {
        return publishDate;
    }
    public String getGenre() {
        return genre;
    }

    // Allow genre to change
    public void setGenre(String genre) {
        if (genre != null && genre.trim().isEmpty()) {
            throw new IllegalArgumentException("genre is null");
        }
        this.genre = genre;
    }
}
