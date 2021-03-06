package com.awesomevendingco.vendingmachine.products;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ProductValuatorTest {

    private ProductValuatorImpl valuator;

    @Before
    public void setup() {
        valuator = new ProductValuatorImpl();
        valuator.setProductPrices(productValues());
    }

    private Map<String, Double> productValues() {
        Map<String, Double> coinValues = new HashMap<String, Double>();
        coinValues.put(MockProductValuator.GOOD_PRODUCT, MockProductValuator.GOOD_PRODUCT_PRICE);
        return coinValues;
    }

    @Test
    public void it_returns_price_of_product() {
        double price = valuator.lookupProduct(MockProductValuator.GOOD_PRODUCT);
        assertEquals(MockProductValuator.GOOD_PRODUCT_PRICE, price, 0.001);
    }

    @Test(expected = InvalidProductException.class)
    public void it_throws_invalid_product_exception_when_product_is_invalid() {
        valuator.lookupProduct(MockProductValuator.BAD_PRODUCT);
    }

}
