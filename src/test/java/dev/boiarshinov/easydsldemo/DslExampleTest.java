package dev.boiarshinov.easydsldemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DslExampleTest {

    @Test
    void doJob() {
        final String expectedResult = "Started\nWhen do first step\nWhen do second step\nAnd you're awesome\n";

        final String actualResult = new DslExample().doJob();

        assertEquals(expectedResult, actualResult);
        System.out.println(actualResult);
    }
}