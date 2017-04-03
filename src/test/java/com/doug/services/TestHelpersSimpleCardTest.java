package com.doug.services;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

/**
 * Created by doug on 1/21/17.
 */

@SpringBootTest
public class TestHelpersSimpleCardTest {

    @Test
    public void simpleTest() {
        assertEquals("one", "one");
    }
}
