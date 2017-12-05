package com.sap.hybris.tdd.labs.shop.console.product;

import java.math.BigDecimal;

import com.sap.hybris.tdd.labs.shop.console.Product;

public class Wine extends Product {

    public Wine() {
        super("Wine", new BigDecimal("15.78"));
    }
}
