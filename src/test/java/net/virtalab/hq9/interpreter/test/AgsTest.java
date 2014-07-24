package net.virtalab.hq9.interpreter.test;

import net.virtalab.hq9.interpreter.Usage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests command line args
 */
public class AgsTest {

    /**
     * Dummy test (improve it)
     */
    @Test
    public void showMeAnUsage(){
        int exceptedMinLength = 5;
        String beginsWith = "Usage";

        String actualUsage = Usage.show();

        Assert.assertTrue(actualUsage.length() >= exceptedMinLength);
        Assert.assertTrue(actualUsage.contains(beginsWith));

    }
}
