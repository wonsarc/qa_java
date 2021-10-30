package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LionAlexTest {

    @Test
    public void testGetFriends() throws Exception {
        LionAlex lionAlex = new LionAlex();
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");;
        List<String> actualFriends = lionAlex.getFriends();
        Assert.assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex();
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = lionAlex.getPlaceOfLiving();
        Assert.assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void testGetKittens() throws Exception {
        LionAlex lionAlex = new LionAlex();
        int expectedKittensCount = 0;
        int actualKittensCount = lionAlex.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
