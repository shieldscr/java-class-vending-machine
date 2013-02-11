package com.awesomevendingco.vendingmachine.coins;

public class MockCoinTranslator implements CoinTranslator {

    public static final String BAD_COIN = "BAD_COIN";
    public static final String GOOD_COIN = "COIN";
    public static final double GOOD_COIN_VALUE = 0.45;

    public double valuateCoin(String coin) {
        if (coin.equals(GOOD_COIN))
            return GOOD_COIN_VALUE;
        throw new InvalidCoinException();
    }

}
