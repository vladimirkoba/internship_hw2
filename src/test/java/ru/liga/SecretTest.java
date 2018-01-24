package ru.liga;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecretTest {

    @Test
    public void branchIsMergedCorrectly() {
        assertEquals("AB", new Secret("A", "B").generate());
    }

}