package com.library.interfaces;

import com.library.models.Book;

import java.util.List;

public interface Searchable {
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
    List<Book> searchByGenre(String genre);
}
