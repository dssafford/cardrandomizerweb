package com.doug.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by doug on 1/21/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestHelpersTest {

    @Test
    public void simpleTest() {
        assertEquals("one", "one");
    }
}
