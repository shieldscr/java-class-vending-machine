package com.awesomevendingco.vendingmachine.coins;

import com.awesomevendingco.vendingmachine.coins.CoinTranslator;
import com.awesomevendingco.vendingmachine.coins.InvalidCoinException;

public class MockCoinTranslator implements CoinTranslator {

    public double valuateCoin(String coin) {
        if (coin.equals("COIN"))
            return 0.45;
        throw new InvalidCoinException();
    }

}
