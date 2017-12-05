package com.sap.hybris.tdd.labs.shop.console;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Represents a product defined by name and price.
 */
public class Product {

    private final String name;
    private final BigDecimal price;

    /**
     * Constructs a new product defined by name and price.
     * @param name the name.
     * @param price the price.
     * @throws NullPointerException if the name or the price is {@code null}.
     */
    public Product(final String name, final BigDecimal price) {
        Objects.requireNonNull(name, "name cannot be null");
        Objects.requireNonNull(price, "price cannot be null");
        this.name = name;
        this.price = price;
    }

    /**
     * Returns product's name.
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns product's price.
     * @return the price.
     */
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + name.hashCode();
        result = prime * result + price.hashCode();
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
        final Product other = (Product) obj;
        return Objects.equals(name, other.name) && Objects.equals(price, other.price);
    }
}
