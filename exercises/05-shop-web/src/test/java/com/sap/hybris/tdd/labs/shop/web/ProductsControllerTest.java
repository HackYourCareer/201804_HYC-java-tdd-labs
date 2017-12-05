package com.sap.hybris.tdd.labs.shop.web;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@RunWith(MockitoJUnitRunner.class)
public class ProductsControllerTest {

    @InjectMocks
    private ProductsController productsController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/resources/templates/");
        viewResolver.setSuffix(".html");

        mockMvc = MockMvcBuilders.standaloneSetup(productsController).setViewResolvers(viewResolver).build();
    }

    @Test
    public void shouldReturnedAlltProducts() throws Exception {
        // TODO 01 verify that '/products' returns all products:
        // - operation status is 200 Ok
        // - model contains attribute called 'product' with list of all our products
        // - view named is equal to 'products'



        // TODO 02 run this test method, it should fail, now go to ProductController#products()
        // add missing implementation and run test again


    }

    @Test
    public void shouldAddProductToCart() throws Exception {
        // TODO 03 verify that POST call to '/cart' add a product
        // - you should provide "name" of product
        // - status should be redirection
        // - we should be redirected to view name '/products'


    }

    @Test
    public void shouldNotAddProductToCartWhenNameNotProvided() throws Exception {
        // TODO 04 verify that it is impossible to add a product without name
        // - status should be bad request


    }

    @Test
    public void shouldPresentCart() throws Exception {
        // TODO 05 verify that GET '/cart' returns current cart status
        // model have attributes:
        // - 'productsInCart' with type java.util.List
        // - 'sum' - sum of all product with cart
        // - 'calculationContext' - calculation context use to calculate "sum"


    }

    @Test
    public void shouldRemoveProductFromCart() throws Exception {
        // TODO 06 verify that POST '/cart/remove' removes an item from the cart
        // you need to provide parameter 'index'
        // we expect:
        // - status should be redirection
        // - we are redirected to view '/cart'


    }

    // TODO 07 add rest of a tests:
    // - removing product from cart but not provide 'index' parameter
    // - re-calculating cart
    // - re-calculating cart but without needed parameter


}
