package com.awesomevendingco.vendingmachine.machine;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.awesomevendingco.vendingmachine.coins.MockCoinTranslator;

public class VendingMachine_WhenNoCoinsInserted_Test {

    private VendingMachine machine;

    @Before
    public void setup() {
        machine = new VendingMachine();
        machine.setCoinTranslator(new MockCoinTranslator());
    }

    @Test
    public void it_displays_balance_of_zero() {
        assertEquals("0.00", machine.getBalance());
    }

    @Test
    public void it_displays_message_of_insert_coin() {
        assertEquals("INSERT COIN", machine.getMessage());
    }

}
