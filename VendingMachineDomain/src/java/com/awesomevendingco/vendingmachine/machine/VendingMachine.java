package com.awesomevendingco.vendingmachine.machine;

import java.util.ArrayList;
import java.util.List;

import com.awesomevendingco.vendingmachine.coins.CoinTranslator;
import com.awesomevendingco.vendingmachine.coins.InvalidCoinException;

public class VendingMachine {

    private CoinTranslator coinTranslator;

    public void setCoinTranslator(CoinTranslator coinTranslator) {
        this.coinTranslator = coinTranslator;
    }

    private double currentTotal;
    private String message = "INSERT COIN";
    private List<String> coinReturn = new ArrayList<String>();

    public void insertCoin(String coin) {
        try {
            message = "INSERT COIN";
            currentTotal += coinTranslator.valuateCoin(coin);
        } catch (InvalidCoinException ex) {
            message = "INVALID COIN";
            coinReturn.add(coin);
        }
    }

    public String getBalance() {
        return String.format("%4.2f", currentTotal);
    }

    public String getMessage() {
        return message;
    }

    public List<String> getCoinReturn() {
        return coinReturn;
    }

}
