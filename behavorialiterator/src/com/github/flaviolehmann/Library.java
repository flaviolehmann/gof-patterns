package com.github.flaviolehmann;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book> {

    private Long id;
    private String name;
    private Book favoriteBook;
    private List<Book> catalog = new ArrayList<>();

    /**
     * I want my iteration to always return the favorite book as the last one, so I implement the iterator method
     * like this:
     */
    @Override
    public Iterator<Book> iterator() {
        List<Book> allBooks = new ArrayList<>(catalog);
        allBooks.add(favoriteBook);
        return new LibraryIterator(allBooks);
    }

    public Library(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setFavoriteBook(Book favoriteBook) {
        this.favoriteBook = favoriteBook;
    }

    public void setCatalog(List<Book> catalog) {
        this.catalog = new ArrayList<>(catalog);
    }

    private class LibraryIterator implements Iterator<Book> {

        private List<Book> books;
        private int currentPosition = 0;

        public LibraryIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return currentPosition < books.size();
        }

        @Override
        public Book next() {
            Book currentBook = books.get(currentPosition);
            currentPosition = currentPosition + 1;
            return currentBook;
        }
    }
}
