package com.sap.hybris.tdd.labs.basics.assertj;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Represents a {@link BookRepository} which stores all books in memory.
 */
public class InMemoryBookRepository implements BookRepository {

    private final Map<Integer, Book> books = new LinkedHashMap<>();

    /**
     * Constructs a new instance that stores books in memory.
     * @param books the books to store (cannot: be {@code null}, contain {@code null}s and books with the same ids).
     */
    public InMemoryBookRepository(final Iterable<Book> books) {
        Objects.requireNonNull(books);
        for (final Book book : books) {
            Objects.requireNonNull(book);
            if (this.books.containsKey(book.getId())) {
                throw new IllegalArgumentException(String.format("Two or more books have the same id: %d", book.getId()));
            }
            this.books.put(book.getId(), book);
        }
    }

    @Override
    public Optional<Book> findById(final int id) {
        return Optional.ofNullable(books.get(id));
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

    @Override
    public Map<Integer, Book> findByQuery(final Predicate<Book> query) {
        return books.values().stream().filter(query).collect(Collectors.toMap(Book::getId, Function.identity()));
    }
}
