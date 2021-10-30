package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;
    private boolean expectedHasMane;

    public LionTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] setSexLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testSetDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex);
        boolean actualHasMane = lion.doesHaveMane();
        Assert.assertEquals(actualHasMane, expectedHasMane);
    }

    @Test(expected = Exception.class)
    public void divisionDoesHaveManeThrowsException() throws Exception {
        Lion lion = new Lion("Вертолет");
    }

}
