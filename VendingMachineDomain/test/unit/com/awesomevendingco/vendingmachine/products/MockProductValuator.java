package com.awesomevendingco.vendingmachine.products;


public class MockProductValuator implements ProductValuator {

    public static final String GOOD_PRODUCT = "GOOD_PRODUCT";
    public static final String BAD_PRODUCT = "BAD_PRODUCT";
    public static final double GOOD_PRODUCT_PRICE = 0.45;

    public double lookupProduct(String product) {
        if (product.equals(GOOD_PRODUCT))
            return GOOD_PRODUCT_PRICE;
        throw new InvalidProductException();
    }

}
