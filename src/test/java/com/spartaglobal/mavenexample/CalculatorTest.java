package com.spartaglobal.mavenexample;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdditon() {
        Assert.assertEquals(4, calculator.add(2, 4));
    }
    @Test
    public void testSubtraction() {
        Assert.assertEquals(5, calculator.subtract(8, 3));
    }
    @Test
    public void testDivision() {
        Assert.assertEquals(7, calculator.division(14, 2));
    }
    @Test
    public void testMultiply() {
        Assert.assertEquals(28, calculator.multiply(14, 2));
    }
}
