package com.techreturners.exercise001;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise001Test {

    @Test
    public void checkHello() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("Hello", ex001.capitalizeWord("hello"));
        assertEquals("The quick fox", ex001.capitalizeWord("the quick fox"));
        assertEquals("Oh no, bears!!!", ex001.capitalizeWord("oh no, bears!!!"));
    }

    @Test
    public void checkHelloAlreadyUppercase() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("Hello", ex001.capitalizeWord("Hello"));
    }

    @Test
    public void checkInitials() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("F.B", ex001.generateInitials("Frederic", "Bonneville"));
    }

    @Test
    public void checkAddVat() {
        Exercise001 ex001 = new Exercise001();
        assertEquals(120, ex001.addVat(100, 20), 0.0);
        assertEquals(47, ex001.addVat(40, 17.5), 0.0);
        assertEquals(39.36, ex001.addVat(33.5, 17.5), 0.0);
        assertEquals(25, ex001.addVat(25, 0), 0.0);
    }

    @Test
    public void checkSentenceReverse() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("oof", ex001.reverse("foo"));

        assertEquals("?siht od ot tnaw neve uoy dluow yhw", ex001.reverse("why would you even want to do this?"));
    }
}
