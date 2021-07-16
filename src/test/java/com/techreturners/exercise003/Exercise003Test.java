package com.techreturners.exercise003;

import com.techreturners.exercise003.Exercise003;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class Exercise003Test {

    private Exercise003 ex003;

    @Before
    public void setup() {
        ex003 = new Exercise003();
    }

    @Test
    public void checkPickColorCodeForBlue() {
        int colorInput = 0;
        String expected = "blue";

        assertEquals(expected, ex003.pickColor(colorInput));
    }

    @Ignore("You can remove this @ignore annotation to run the test")
    @Test
    public void checkPickColorCodeForOrange() {
        int colorInput = 1;
        String expected = "orange";

        assertEquals(expected, ex003.pickColor(colorInput));
    }

    @Ignore("You can remove this @ignore annotation to run the test")
    @Test
    public void checkPickColorCodeForGreen() {
        int colorInput = 5;
        String expected = "green";

        assertEquals(expected, ex003.pickColor(colorInput));
    }

    @Ignore("You can remove this @ignore annotation to run the test")
    @Test
    public void checkPickMultipleColorCodes() {

        String[] expected = { "blue", "orange", "red", "black", "yellow", "green" };

        assertEquals(expected, ex003.colors());
    }


}
