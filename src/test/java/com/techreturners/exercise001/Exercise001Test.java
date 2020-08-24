package com.techreturners.exercise001;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise001Test {

    @Test
    public void checkHello() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("Hello", ex001.capitalizeWord("hello"));
    }
}
