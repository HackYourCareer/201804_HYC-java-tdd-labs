package com.sap.hybris.tdd.labs.basics.mockito.model;

public class ProductModel implements Model {

    private final String name;

    public ProductModel(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ProductModel{name='" + name + "'}";
    }
}
