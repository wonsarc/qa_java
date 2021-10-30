package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(Enclosed.class)
public class LionTest {

    @RunWith(Parameterized.class)
    public static class LionParamTests {
        private final String sex;
        private boolean expectedHasMane;

        public LionParamTests(String sex, boolean expectedHasMane) {
            this.sex = sex;
            this.expectedHasMane = expectedHasMane;
        }


        @Parameterized.Parameters
        public static Object[][] setSexLion() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false}
            };
        }

        @Test
        public void testDoesHaveMane() throws Exception {
            Lion lion = new Lion(sex);
            boolean actualHasMane = lion.doesHaveMane();
            Assert.assertEquals(actualHasMane, expectedHasMane);
        }
    }

    @RunWith(MockitoJUnitRunner.class)
    public static class LionSingleTests {

        @Mock
        Feline feline;

        @Test(expected = Exception.class)
        public void testDivisionDoesHaveManeThrowsException() throws Exception {
            Lion lion = new Lion("Вертолет");
        }

        @Test
        public void testGetKittens() throws Exception {
            Lion lion = new Lion(feline);
            int expectedCount = 0;
            int actualCount = lion.getKittens();
            Assert.assertEquals(expectedCount, actualCount);
        }

        @Test
        public void testGetFood() throws Exception {
            Lion lion = new Lion(feline);
            List<String> expectedFood = Arrays.asList();
            List<String> actualFood = lion.getFood();
            Assert.assertEquals(expectedFood, actualFood);
        }
    }
}
