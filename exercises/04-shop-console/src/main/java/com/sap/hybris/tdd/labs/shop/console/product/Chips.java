package com.sap.hybris.tdd.labs.shop.console.product;

import java.math.BigDecimal;

import com.sap.hybris.tdd.labs.shop.console.Product;

public class Chips extends Product {

    public Chips() {
        super("Chips", new BigDecimal("1.99"));
    }
}
