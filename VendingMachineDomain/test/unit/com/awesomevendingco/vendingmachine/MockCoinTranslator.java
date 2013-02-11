package com.awesomevendingco.vendingmachine;

import com.awesomevendingco.vendingmachine.CoinTranslator;
import com.awesomevendingco.vendingmachine.InvalidCoinException;

public class MockCoinTranslator implements CoinTranslator {

    public double valuateCoin(String coin) {
        if (coin.equals("COIN"))
            return 0.45;
        throw new InvalidCoinException();
    }

}
