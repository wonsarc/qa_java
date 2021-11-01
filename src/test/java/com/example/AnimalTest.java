package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Enclosed.class)
public class AnimalTest {
    @RunWith(Parameterized.class)
    public static class AnimalParamTests {
        private final String animalKind;
        private List<String> expectedFoodList;

        public AnimalParamTests(String animalKind, List<String> expectedFoodList) {
            this.animalKind = animalKind;
            this.expectedFoodList = expectedFoodList;
        }


        @Parameterized.Parameters
        public static Object[][] getFoodList() {
            return new Object[][]{
                    {"Травоядное", List.of("Трава", "Различные растения")},
                    {"Хищник", List.of("Животные", "Птицы", "Рыба")}
            };
        }

        @Test
        public void testGetFood() throws Exception {
            Animal animal = new Animal();
            List<String> actualFoodList = animal.getFood(animalKind);
            Assert.assertEquals(actualFoodList, expectedFoodList);
        }
    }

    public static class AnimalSingleTests {

        @Test(expected = Exception.class)
        public void testDivisionGetFoodThrowsException() throws Exception {
            Animal animal = new Animal();
            animal.getFood("Человек");
        }

        @Test
        public void testGetFamily() {
            Animal animal = new Animal();
            String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
            String actualFamily = animal.getFamily();
            Assert.assertEquals(expectedFamily, actualFamily);
        }
    }

}
