package com.sap.hybris.tdd.labs.shop.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sap.hybris.tdd.labs.shop.web.products.Product;

@Controller
public class ProductsController {

    @GetMapping("/products")
    public String products(final Model model) {

        return "products";
    }

    @PostMapping("/cart")
    public String addToCart(@ModelAttribute @Valid final Product productToAdd) {

        return "redirect:/products";
    }

    @GetMapping("/cart")
    public String cart(final Model model) {

        return "cart";
    }

    @PostMapping("/cart/calculate")
    public String cartCalculate(@ModelAttribute final CalculationContext calculationContext) {

        return "redirect:/cart";
    }

    @PostMapping("/cart/remove")
    public String cartDelete(final Integer index) {

        return "redirect:/cart";
    }
}
