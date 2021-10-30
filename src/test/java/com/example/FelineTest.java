package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = feline.eatMeat();
        List<String> actualFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void testGetKittensDefaultReturnOne() {
        Feline feline = new Feline();
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testGetKittensReturnSetNumbers() {
        Feline feline = new Feline();
        int expectedCount = 5;
        int actualCount = feline.getKittens(expectedCount);
        Assert.assertEquals(expectedCount, actualCount);
    }
}
