package com.sap.hybris.tdd.labs.shop.console.product;

import java.math.BigDecimal;

import com.sap.hybris.tdd.labs.shop.console.Product;

public class Beer extends Product {

    public Beer() {
        super("Beer", new BigDecimal("2.87"));
    }
}
