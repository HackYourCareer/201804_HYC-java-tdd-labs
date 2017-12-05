package com.sap.hybris.tdd.labs.basics.assertj;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class BookTest {

    private static final int ID_1 = 1;
    private static final String NAME_1 = "name1";
    private static final BigDecimal PRICE_1 = new BigDecimal("1.1");

    private static final int ID_2 = 2;
    private static final String NAME_2 = "name2";
    private static final BigDecimal PRICE_2 = new BigDecimal("2.2");

    @Test(expected = IllegalArgumentException.class)
    public void constructWhenIdIsLowerThanZero() {
        new Book(-1, NAME_1, PRICE_1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructWhenIdIsEqualToZero() {
        new Book(0, NAME_1, PRICE_1);
    }

    @Test(expected = NullPointerException.class)
    public void constructWhenNameIsNull() {
        new Book(ID_1, null, PRICE_1);
    }

    @Test(expected = NullPointerException.class)
    public void constructWhenPriceIsNull() {
        new Book(ID_1, NAME_1, null);
    }

    @Test
    public void equalsWhenObjectsAreTheSame() {
        // given
        final Book book = new Book(ID_1, NAME_1, PRICE_1);
        final Book other = new Book(ID_1, NAME_1, PRICE_1);

        // when
        final boolean result = book.equals(other);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void equalsWhenOtherIsNull() {
        // given
        final Book book = new Book(ID_1, NAME_1, PRICE_1);
        final Object other = null;

        // when
        final boolean result = book.equals(other);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void equalsWhenOtherIsInstanceOfSuperClass() {
        // given
        final Book book = new Book(ID_1, NAME_1, PRICE_1);
        final Object other = new Object();

        // when
        final boolean result = book.equals(other);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void equalsWhenOtherIsInstanceOfSubClass() {
        // given
        final Book book = new Book(ID_1, NAME_1, PRICE_1);
        class SubBook extends Book {
            public SubBook(final int id, final String name, final BigDecimal price) {
                super(id, name, price);
            }
        }
        final Object other = new SubBook(ID_1, NAME_1, PRICE_1);

        // when
        final boolean result = book.equals(other);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void equalsWhenObjectsAreDifferent() {
        // given
        final Book book = new Book(ID_1, NAME_1, PRICE_1);

        // then
        assertThat(book).isNotEqualTo(new Book(ID_1, NAME_1, PRICE_2));
        assertThat(book).isNotEqualTo(new Book(ID_1, NAME_2, PRICE_1));
        assertThat(book).isNotEqualTo(new Book(ID_1, NAME_2, PRICE_2));
        assertThat(book).isNotEqualTo(new Book(ID_2, NAME_1, PRICE_1));
        assertThat(book).isNotEqualTo(new Book(ID_2, NAME_1, PRICE_2));
        assertThat(book).isNotEqualTo(new Book(ID_2, NAME_2, PRICE_1));
        assertThat(book).isNotEqualTo(new Book(ID_2, NAME_2, PRICE_2));
    }
}
