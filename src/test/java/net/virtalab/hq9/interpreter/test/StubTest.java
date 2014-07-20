package net.virtalab.hq9.interpreter.test;

import net.virtalab.hq9.interpreter.App;
import org.junit.Assert;
import org.junit.Test;

/**
 * Stub Unit Test Class
 */
public class StubTest {
    /**
     * This is stub test that checks nothing and wll be removed as soon as something meanful will be written
     */
    @Test
    public void programOutputTest(){
        String expectedOutput = App.LINE;
        String actualOutput = App.getLine();

        Assert.assertEquals("Suddenly output is not as excepted.", expectedOutput, actualOutput);
    }
}
