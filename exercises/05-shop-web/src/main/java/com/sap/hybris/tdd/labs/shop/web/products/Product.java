package com.sap.hybris.tdd.labs.shop.web.products;


import javax.validation.constraints.NotNull;

public class Product {
    @NotNull
    private String name;
    private int price;

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }
}
