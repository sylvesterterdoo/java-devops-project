package com.smu.mscda;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private String userInput = "smu";
    @Test
    public void hashUserInput() {
        String actual = Main.capitalizeUserInput(userInput);
        Assert.assertEquals("Smu", actual);
    }

    @Test
    public void capitalizeUserInput() {
        String actual = Main.hashUserInput(userInput);
        String expected = "3773300c2f413cc7136f8d74b305519c";
        Assert.assertEquals(expected, actual);
    }
}