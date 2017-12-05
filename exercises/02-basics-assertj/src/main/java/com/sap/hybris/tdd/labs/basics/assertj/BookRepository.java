package com.sap.hybris.tdd.labs.basics.assertj;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Provides operations to retrieve books.
 */
public interface BookRepository {

    /**
     * Returns a book by its id.
     * @param id the id of the searched book.
     * @return the book associated with the id.
     */
    Optional<Book> findById(int id);

    /**
     * Returns all available books.
     * @return all available books.
     */
    List<Book> findAll();

    /**
     * Returns all books matched to a query.
     * @param query the query.
     * @return matched books by id.
     */
    Map<Integer, Book> findByQuery(Predicate<Book> query);
}
