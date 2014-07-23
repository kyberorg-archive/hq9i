package net.virtalab.hq9.interpreter.test;

import net.virtalab.hq9.interpreter.Interpreter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.IllegalFormatException;

/**
 * Tests core (interpreter itself)
 */
public class CoreTest {

    private static String HELLO_TEXT="Hello, world!";

    private Interpreter i;

    @Before
    public void prepareInterpreter(){
         i = Interpreter.init();
    }

    @Test
    public void SingleHelloTest(){
        String code = "H";
        String expectedResult = HELLO_TEXT;

        i.run(code);
        String rslt = i.getResult();

        Assert.assertEquals(expectedResult,rslt);
    }

    @Test
    public void DoubleHelloTest(){
        String code = "H";
        String expectedResult = HELLO_TEXT+System.lineSeparator()+HELLO_TEXT;

        i.run(code);
        String rslt = i.getResult();

        Assert.assertEquals(expectedResult,rslt);

    }

    @Test(expected = IllegalFormatException.class)
    public void SyntaxErrorOnWrongLetter(){
        String code = "V";

        i.run(code);

    }
}
