package com.sap.hybris.tdd.labs.basics.assertj;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

import org.junit.Test;

// TODO 00 tests that will be modified within exercises will not cover all branches. We want you to focus on AssertJ basics.
public final class InMemoryBookRepositoryTest {

    private static final int BOOK_1_ID = 1;
    private static final String BOOK_1_NAME = "Test Driven Development";
    private static final BigDecimal BOOK_1_PRICE = new BigDecimal("23.20");
    private static final Book BOOK_1 = new Book(BOOK_1_ID, BOOK_1_NAME, BOOK_1_PRICE);
    private static final int BOOK_2_ID = 2;
    private static final String BOOK_2_NAME = "jUnit in Practice";
    private static final BigDecimal BOOK_2_PRICE = new BigDecimal("15.99");
    private static final Book BOOK_2 = new Book(BOOK_2_ID, BOOK_2_NAME, BOOK_2_PRICE);
    private static final int BOOK_3_ID = 3;
    private static final String BOOK_3_NAME = "AssertJ Framework";
    private static final BigDecimal BOOK_3_PRICE = new BigDecimal("9.50");
    private static final Book BOOK_3 = new Book(BOOK_3_ID, BOOK_3_NAME, BOOK_3_PRICE);
    private static final int BOOK_4_ID = 4;
    private static final String BOOK_4_NAME = "The Art of Unit Testing";
    private static final BigDecimal BOOK_4_PRICE = new BigDecimal("19.30");
    private static final Book BOOK_4 = new Book(BOOK_4_ID, BOOK_4_NAME, BOOK_4_PRICE);

    private final BookRepository repository = new InMemoryBookRepository(Arrays.asList(BOOK_1, BOOK_2, BOOK_3, BOOK_4));

    @Test
    public void findById() {
        // when
        final Optional<Book> result = repository.findById(BOOK_2_ID);

        // then

        // TODO 01 replace JUnit assertions with AssertJ assertions.
        assertNotNull(result);
        assertTrue(result.isPresent());
        final Book book = result.get();
        assertSame(BOOK_2_ID, book.getId());
        assertSame(BOOK_2_NAME, book.getName());
        assertSame(BOOK_2_PRICE, book.getPrice());
    }

    @Test
    public void findAll() {
        // when
        final List<Book> result = repository.findAll();

        // then

        // TODO 02 verify that result is:
        // * not null
        // * contains 4 books
        // * books are in correct order: book 1, book 2, book 3 and book 4
    }

    @Test
    public void findByQuery() {
        // given
        final Predicate<Book> wherePriceBetween10and20 = book -> book.getPrice().compareTo(new BigDecimal("10.0")) > 0
                && book.getPrice().compareTo(new BigDecimal("20.0")) < 0;

        // when
        final Map<Integer, Book> result = repository.findByQuery(wherePriceBetween10and20);

        // then

        // TODO 03 (optional) verify that result is:
        // * not null
        // * contains 2 books
        // * contains books (book 2 and book 4) associated to correct identifiers
    }
}
