package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private static Object feline;
    private final String sex;
    private final boolean expectedHasMane;

    public LionParameterizedTest(String sex, Object feline, boolean expectedHasMane) {
        this.sex = sex;
        this.feline = feline;
        this.expectedHasMane = expectedHasMane;
    }


    @Parameterized.Parameters
    public static Object[][] setSexLion() {
        return new Object[][]{
                {"Самец", feline, true},
                {"Самка", feline, false}
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, (Feline) feline);
        boolean actualHasMane = lion.doesHaveMane();
        Assert.assertEquals(actualHasMane, expectedHasMane);
    }
}

