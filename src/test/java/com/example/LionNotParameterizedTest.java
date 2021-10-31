package com.example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionNotParameterizedTest {

    @Mock
    Feline feline;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testDivisionDoesHaveManeThrowsException() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самей или самка");
        Lion lion = new Lion("Вертолет", feline);
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedCount = 0;
        int actualCount = lion.getKittens();
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = Arrays.asList();
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }
}
