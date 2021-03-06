package com.awesomevendingco.vendingmachine.machine;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.awesomevendingco.vendingmachine.coins.MockCoinTranslator;
import com.awesomevendingco.vendingmachine.products.MockProductValuator;

public class VendingMachine_WhenSelectingInvalidProduct_Test {

    private VendingMachine machine;

    @Before
    public void setup() {
        machine = new VendingMachine();
        machine.setCoinTranslator(new MockCoinTranslator());
        machine.setProductValuator(new MockProductValuator());
        machine.selectProduct(MockProductValuator.BAD_PRODUCT);
    }

    @Test
    public void it_displays_message_of_invalid_product() {
        assertEquals("INVALID PRODUCT", machine.getMessage());
    }

}
