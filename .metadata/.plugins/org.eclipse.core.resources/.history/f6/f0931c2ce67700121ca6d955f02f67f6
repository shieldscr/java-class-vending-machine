package com.awesomevendingco.vendingmachine.machine;

import java.util.ArrayList;
import java.util.List;

import com.awesomevendingco.vendingmachine.coins.CoinTranslator;
import com.awesomevendingco.vendingmachine.coins.InvalidCoinException;
import com.awesomevendingco.vendingmachine.products.InvalidProductException;
import com.awesomevendingco.vendingmachine.products.ProductValuator;

public class VendingMachine {

    private CoinTranslator coinTranslator;

    public void setCoinTranslator(CoinTranslator coinTranslator) {
        this.coinTranslator = coinTranslator;
    }

    private ProductValuator productValuator;

    public void setProductValuator(ProductValuator productValuator) {
        this.productValuator = productValuator;
    }

    private double currentTotal;
    private String message = "INSERT COIN";
    private List<String> coinReturn = new ArrayList<String>();
    private List<String> productChute = new ArrayList<String>();

    public void insertCoin(String coin) {
        try {
            processValidCoin(coin);
        } catch (InvalidCoinException ex) {
            processInvalidCoin(coin);
        }
    }

    public void selectProduct(String product) {
        try {
            processValidProduct(product);
        } catch (InvalidProductException ex) {
            processInvalidProduct();
        }
    }

    public String getBalance() {
        return formatMoney(currentTotal);
    }

    public String getMessage() {
        return message;
    }

    public List<String> getCoinReturn() {
        return coinReturn;
    }

    public List<String> getProductChute() {
        return productChute;
    }

    private void processValidCoin(String coin) {
        currentTotal += coinTranslator.valuateCoin(coin);
        message = "INSERT COIN";
    }

    private void processInvalidCoin(String coin) {
        coinReturn.add(coin);
        message = "INVALID COIN";
    }

    private void processValidProduct(String product) {
        double price = productValuator.lookupProduct(product);
        if (price > currentTotal) {
            processInsufficientFuns(price);
        } else {
            completeProductPurchase(product);
        }
    }

    private void processInsufficientFuns(double price) {
        message = String.format("PRICE %s", formatMoney(price));
    }

    private void completeProductPurchase(String product) {
        message = "THANK YOU";
        productChute.add(product);
        currentTotal = 0.00;
    }

    private void processInvalidProduct() {
        message = "INVALID PRODUCT";
    }

    private String formatMoney(double amount) {
        return String.format("%4.2f", amount);
    }

}
