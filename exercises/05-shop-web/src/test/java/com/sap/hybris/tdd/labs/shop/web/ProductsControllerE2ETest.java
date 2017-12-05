package com.sap.hybris.tdd.labs.shop.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShopWebApplication.class)
@WebAppConfiguration
public class ProductsControllerE2ETest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void shouldReturnAvailableProducts() throws Exception {
        // TODO 08 now if we now that all request return data data we need let's test if application will behave just
        // like we expect, first lets check if call GET to '/products' return all available products
        // we also should check if status of this call is 200 OK


        // TODO 09 check if in return we get all products: for now it should be 2 (beer and wine)


    }

    @Test
    public void shouldReturnAllProductFromCart() throws Exception {
        // TODO 10 now we define how adding product to cart should behave
        // initially cart should be empty, so let's test this


        // TODO 11 let's add some product to our cart, status should be redirect


        // TODO 12 now in cart should be one product, so lest test it


        // TODO 13 to be sure add another product to cart


        // TODO 14 check if in cart are two products


    }

    // TODO 15 define additional test:
    // - what should happen when you add product do cart, but this product is not valid (it's name is not on our list?)
    // - how removing products from cart should work (try with good and bad index)
    // - how recalculation of price work, is good strategy is use for that
    // - some more ideas?


}
