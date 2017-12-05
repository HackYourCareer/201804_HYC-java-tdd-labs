package com.sap.hybris.tdd.labs.basics.assertj;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Represents book entity.
 */
public class Book {

    private final int id;
    private final String name;
    private final BigDecimal price;

    /**
     * Constructs a new instance.
     * @param id the id (must be positive).
     * @param name the name (cannot be {@code null}).
     * @param price the price (cannot be {@code null}).
     */
    public Book(final int id, final String name, final BigDecimal price) {
        if (id <= 0) {
            throw new IllegalArgumentException(String.format("id must be positive, current value: %d", id));
        }
        Objects.requireNonNull(name);
        Objects.requireNonNull(price);

        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (price == null ? 0 : price.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        return id == other.id && Objects.equals(name, other.name) && Objects.equals(price, other.price);
    }

    /**
     * Returns id of {@link this} book.
     * @return the id.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns name of {@link this} book.
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns price of {@link this} book.
     * @return the price.
     */
    public BigDecimal getPrice() {
        return price;
    }
}
