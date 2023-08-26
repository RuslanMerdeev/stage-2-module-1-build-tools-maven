package com.epam.demo;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {

    @Test
    public void ifTheyAllArePositive() {
        ArrayList<String> numbers = new ArrayList<>() {{
            add("2.2");
            add("5");
            add("9");
            add("17");
        }};

        boolean got = Utils.isAllPositiveNumbers(numbers);

        assertTrue(got);
    }

    @Test
    public void ifOneOfThemIsNegative() {
        ArrayList<String> numbers = new ArrayList<>() {{
            add("2");
            add("-5");
            add("9");
            add("17");
        }};

        boolean got = Utils.isAllPositiveNumbers(numbers);

        assertFalse(got);
    }

    @Test
    public void ifOneOfThemIsZero() {
        ArrayList<String> numbers = new ArrayList<>() {{
            add("2");
            add("0");
            add("9");
            add("17");
        }};

        boolean got = Utils.isAllPositiveNumbers(numbers);

        assertFalse(got);
    }

    @Test
    public void ifOneOfThemStartsWithZero() {
        ArrayList<String> numbers = new ArrayList<>() {{
            add("05");
        }};

        boolean got = Utils.isAllPositiveNumbers(numbers);

        assertFalse(got);
    }

    @Test
    public void ifOneOfThemIsNull() {
        ArrayList<String> numbers = new ArrayList<>() {{
            add(null);
        }};

        boolean got = Utils.isAllPositiveNumbers(numbers);

        assertFalse(got);
    }
}
