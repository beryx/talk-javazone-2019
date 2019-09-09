package org.example.jpms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class ProductTest {
    @Test
    public void testToString() {
        Product p = new Product(33, "spaghetti", 2.15);
        Logger.getGlobal().info("test product: " + p);
        Assertions.assertEquals("spaghetti: 2.15", p.toString());
        System.out.printf("\n\nTesting module: %s\n",
                            ProductTest.class.getModule().getName());
    }
}
