package com.awesomevendingco.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private CoinTranslator coinTranslator;

    public void setCoinTranslator(CoinTranslator coinTranslator) {
        this.coinTranslator = coinTranslator;
    }

    private double currentTotal;
    private List<String> coinReturn = new ArrayList<String>();

    public void insertCoin(String coin) {
        try {
            currentTotal += coinTranslator.valuateCoin(coin);
        } catch (InvalidCoinException ex) {
            coinReturn.add(coin);
        }
    }

    public String getDisplay() {
        return String.format("%4.2f", currentTotal);
    }

    public List<String> getCoinReturn() {
        return coinReturn;
    }

}
